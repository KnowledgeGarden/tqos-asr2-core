/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.topicquests.hyperbrane.ConcordanceDocument;
import org.topicquests.hyperbrane.ConcordanceParagraph;
import org.topicquests.hyperbrane.ConcordanceSentence;
import org.topicquests.hyperbrane.api.IDocument;
import org.topicquests.hyperbrane.api.IParagraph;
import org.topicquests.hyperbrane.api.ISentence;
import org.topicquests.hyperbrane.api.IWordGram;
import org.topicquests.ks.api.ITicket;
import org.topicquests.os.asr.api.IASRCoreModel;
import org.topicquests.os.asr.api.IDocumentProvider;
import org.topicquests.os.asr.api.ISentenceProvider;
import org.topicquests.os.asr.api.IStatisticsClient;
import org.topicquests.os.asr.common.api.IASRFields;
import org.topicquests.os.asr.wordgram.api.IWordGramAgentModel;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class AsrCoreModel implements IASRCoreModel {
	private AsrCoreEnvironment environment;
	protected IStatisticsClient stats;
	protected ISentenceProvider sentenceProvider;
	protected IDocumentProvider documentProvider;
//	private IWordGramAgentModel gramolizer;

	/**
	 * 
	 */
	public AsrCoreModel(AsrCoreEnvironment env) {
		environment = env;
		stats = environment.getStats();
		sentenceProvider = environment.getSentenceProvider();
		documentProvider = environment.getDocProvider();
//		gramolizer = environment.getWordgramAgentModel();
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordGramId(java.util.List)
	 * /
	@Override
	public String wordGramId(List<String> wordsIds) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordsToGramId(java.lang.String)
	 * /
	@Override
	public String wordsToGramId(String words) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newTerminal(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * /
	@Override
	public IWordGram newTerminal(String wordId, String userId, String topicLocator, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newWordGram(java.util.List, java.lang.String, java.lang.String, java.lang.String)
	 * /
	@Override
	public IWordGram newWordGram(List<String> wordIds, String userId, String topicLocator, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#generateWordGram(java.lang.String, java.lang.String, java.lang.String)
	 * /
	@Override
	public IWordGram generateWordGram(String label, String userId, String topicLocator) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#singletonId(java.lang.String)
	 * /
	@Override
	public String singletonId(String wordId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#existsWordGram(java.lang.String)
	 * /
	@Override
	public boolean existsWordGram(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#addWord(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * /
	@Override
	public String addWord(String word, String sentenceId, String userId, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getThisWordGramByWords(java.lang.String)
	 * /
	@Override
	public IWordGram getThisWordGramByWords(String words) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#addWordGram(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * /
	@Override
	public IWordGram addWordGram(List<String> wordIds, String sentenceId, String userId, String topicLocator,
			String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getWordGram(java.lang.String)
	 * /
	@Override
	public IWordGram getWordGram(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getThisWordGram(java.lang.String)
	 * /
	@Override
	public IWordGram getThisWordGram(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordGramId2WordIds(java.lang.String)
	 * /
	@Override
	public List<String> wordGramId2WordIds(String wordGramId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateWordGram(org.topicquests.hyperbrane.api.IWordGram)
	 * /
	@Override
	public IResult updateWordGram(IWordGram wg) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newSentence(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ISentence newSentence(String documentLocator, String sentence, String userId) {
		ISentence result = new ConcordanceSentence();
		result.setCreatorId(userId);
		Date d = new Date();
		result.setID(UUID.randomUUID().toString());
		result.setCreatorId(userId);
		result.setDate(d);
		result.setLastEditDate(d);
		result.setSentence(sentence);
		result.setDocumentId(documentLocator);
		stats.addToKey(IASRFields.SENTS_IMPORTED);
		return result;	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newDocument(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IDocument newDocument(String documentLocator, String documentType, String userId) {
		IResult r = documentProvider.getDocument(documentLocator, null);
		IDocument result = (IDocument)r.getResultObject();
		environment.logDebug("ASRModel.newDocument- "+result);
		if (result == null) {
			result = new ConcordanceDocument();
			Date d = new Date();
			result.setId(UUID.randomUUID().toString());
			result.setTopicLocator(documentLocator);
			result.setCreatorId(userId);
			result.setDate(d);
			result.setLastEditDate(d);
			result.setNodeType(documentType);
			stats.addToKey(IASRFields.DOCS_IMPORTED);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newParagraph(java.lang.String, java.lang.String)
	 */
	@Override
	public IParagraph newParagraph(String paragraph, String language) {
		IParagraph result = new ConcordanceParagraph();
		result.setParagraph(paragraph, language);
		result.setID(UUID.randomUUID().toString());
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#putSentence(org.topicquests.hyperbrane.api.ISentence)
	 */
	@Override
	public IResult putSentence(ISentence s) {
		return sentenceProvider.putSentence(s);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateSentence(org.topicquests.hyperbrane.api.ISentence)
	 */
	@Override
	public IResult updateSentence(ISentence s) {
		environment.logDebug("ASRCoreModel.updateSentence "+s.getData().toJSONString());
		return sentenceProvider.updateSentence(s);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getSentence(java.lang.String)
	 */
	@Override
	public IResult getSentence(String sentenceId) {
		return sentenceProvider.getSentence(sentenceId);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#putDocument(org.topicquests.hyperbrane.api.IDocument)
	 */
	@Override
	public IResult putDocument(IDocument doc) {
		return documentProvider.putDocument(doc);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateDocument(org.topicquests.hyperbrane.api.IDocument)
	 */
	@Override
	public IResult updateDocument(IDocument doc) {
		return documentProvider.updateDocument(doc);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getDocument(java.lang.String, org.topicquests.ks.api.ITicket)
	 */
	@Override
	public IResult getDocument(String locator, ITicket credentials) {
		return documentProvider.getDocument(locator, credentials);
	}

}
