/**
 * 
 */
package org.topicquests.os.asr;

import org.topicquests.asr.general.GeneralDatabaseEnvironment;
import org.topicquests.asr.general.document.api.IDocumentClient;
import org.topicquests.asr.sentence.api.ISentenceClient;
import org.topicquests.blueprints.pg.BlueprintsPgEnvironment;
import org.topicquests.hyperbrane.WordGramCache;
import org.topicquests.ks.StatisticsUtility;
import org.topicquests.ks.SystemEnvironment;
import org.topicquests.os.asr.api.IASRCoreModel;
import org.topicquests.os.asr.api.IDocumentProvider;
import org.topicquests.os.asr.api.ISentenceProvider;
import org.topicquests.os.asr.api.IStatisticsClient;
import org.topicquests.os.asr.api.IWordGramChangeEventRegistry;
import org.topicquests.os.asr.events.WordGramChangeEventRegistry;
import org.topicquests.os.asr.wordgram.WordGramEnvironment;
import org.topicquests.os.asr.wordgram.api.IWordGramAgentModel;
import org.topicquests.support.RootEnvironment;

import com.tinkerpop.blueprints.impls.sql.SqlGraph;

/**
 * @author jackpark
 *
 */
public class AsrCoreEnvironment extends RootEnvironment {
	private static AsrCoreEnvironment instance;
	private SystemEnvironment topicMapEnvironment;
	private IStatisticsClient stats;
	private IWordGramChangeEventRegistry changeRegistry;
	private WordGramEnvironment wordGramEnvironment;
	private IASRCoreModel model;
	private ISentenceProvider sentenceProvider;
	private IDocumentProvider documentProvider;
	private IDocumentClient documentDatabase;
	private ISentenceClient sentenceDatabase;
	private GeneralDatabaseEnvironment generalEnvironment;
	private WordGramCache wgCache;
	private final int cacheSize = 8192;
	/**
	 */
	public AsrCoreEnvironment() {
		super("asr-props.xml", "logger.properties");
		topicMapEnvironment = new SystemEnvironment();
		stats = topicMapEnvironment.getStats();
		changeRegistry = new WordGramChangeEventRegistry();
		wordGramEnvironment = new WordGramEnvironment("wordgram-props", "logger.properties");
		wgCache = new WordGramCache(this, cacheSize);
		String schemaName = getStringProperty("DatabaseSchema");
		generalEnvironment = new GeneralDatabaseEnvironment(schemaName);
		sentenceDatabase = generalEnvironment.getSentenceClient();
		documentDatabase = generalEnvironment.getDocumentClient();
		documentProvider = new DocumentProvider(this);
		sentenceProvider = new SentenceProvider(this);
		model = new AsrCoreModel(this);
		instance = this;
	}
	
	public static AsrCoreEnvironment getInstance() {
		return instance;
	}
	
	public IWordGramChangeEventRegistry getWordGramChangeEventRegistry() {
		return changeRegistry;
	}

	
	public GeneralDatabaseEnvironment getGeneralDatabaseEnvironment() {
		return generalEnvironment;
	}
	
	public IASRCoreModel getCoreModel() {
		return model;
	}
	
	public WordGramCache getWordGramCache() {
		return wgCache;
	}
	
	public IWordGramAgentModel getWordgramAgentModel() {
		return wordGramEnvironment.getModel();
	}
	public IDocumentProvider getDocProvider() {
		return documentProvider;
	}
	public IDocumentClient getDocumentDatabase () {
		return documentDatabase;
	}
	public ISentenceClient getSentenceDatabase() {
		return sentenceDatabase;
	}

	public ISentenceProvider getSentenceProvider() {
		return sentenceProvider;
	}
	
	public String getGraphName() {
		return getStringProperty("GraphName");
	}
	
	public SystemEnvironment getTopicMapEnvironment() {
		return topicMapEnvironment;
	}

	
	public IStatisticsClient getStats() {
		return stats;
	}

	public WordGramEnvironment getWordGramEnvironment() {
		return wordGramEnvironment;
	}
	
	/**
	 * The WordGram graph
	 * @return
	 */
	public SqlGraph getTheGraph() {
		return wordGramEnvironment.getSqlGraph();
	}

	
	public void shutDown() {
		System.out.println("AsrCoreEnvironment shutting down");
		topicMapEnvironment.shutDown();
		wordGramEnvironment.shutDown();
	}
}
