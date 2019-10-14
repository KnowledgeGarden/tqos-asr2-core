/**
 * 
 */
package org.topicquests.os.asr;

import java.util.List;

import org.topicquests.hyperbrane.api.IDocument;
import org.topicquests.hyperbrane.api.IParagraph;
import org.topicquests.hyperbrane.api.ISentence;
import org.topicquests.hyperbrane.api.IWordGram;
import org.topicquests.ks.api.ITicket;
import org.topicquests.os.asr.api.IASRCoreModel;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class AsrCoreModel implements IASRCoreModel {
	private AsrCoreEnvironment environment;
	/**
	 * 
	 */
	public AsrCoreModel(AsrCoreEnvironment env) {
		environment = env;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordGramId(java.util.List)
	 */
	@Override
	public String wordGramId(List<String> wordsIds) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordsToGramId(java.lang.String)
	 */
	@Override
	public String wordsToGramId(String words) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newTerminal(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IWordGram newTerminal(String wordId, String userId, String topicLocator, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newWordGram(java.util.List, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IWordGram newWordGram(List<String> wordIds, String userId, String topicLocator, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#generateWordGram(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IWordGram generateWordGram(String label, String userId, String topicLocator) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#singletonId(java.lang.String)
	 */
	@Override
	public String singletonId(String wordId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#existsWordGram(java.lang.String)
	 */
	@Override
	public boolean existsWordGram(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#addWord(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String addWord(String word, String sentenceId, String userId, String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getThisWordGramByWords(java.lang.String)
	 */
	@Override
	public IWordGram getThisWordGramByWords(String words) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#addWordGram(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IWordGram addWordGram(List<String> wordIds, String sentenceId, String userId, String topicLocator,
			String lexType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getWordGram(java.lang.String)
	 */
	@Override
	public IWordGram getWordGram(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getThisWordGram(java.lang.String)
	 */
	@Override
	public IWordGram getThisWordGram(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#wordGramId2WordIds(java.lang.String)
	 */
	@Override
	public List<String> wordGramId2WordIds(String wordGramId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateWordGram(org.topicquests.hyperbrane.api.IWordGram)
	 */
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
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newDocument(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public IDocument newDocument(String documentLocator, String documentType, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#newParagraph(java.lang.String, java.lang.String)
	 */
	@Override
	public IParagraph newParagraph(String paragraph, String language) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#putSentence(org.topicquests.hyperbrane.api.ISentence)
	 */
	@Override
	public IResult putSentence(ISentence s) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateSentence(org.topicquests.hyperbrane.api.ISentence)
	 */
	@Override
	public IResult updateSentence(ISentence s) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getSentence(java.lang.String)
	 */
	@Override
	public IResult getSentence(String sentenceId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#putDocument(org.topicquests.hyperbrane.api.IDocument)
	 */
	@Override
	public IResult putDocument(IDocument doc) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#updateDocument(org.topicquests.hyperbrane.api.IDocument)
	 */
	@Override
	public IResult updateDocument(IDocument doc) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.asr.api.IASRCoreModel#getDocument(java.lang.String, org.topicquests.ks.api.ITicket)
	 */
	@Override
	public IResult getDocument(String locator, ITicket credentials) {
		// TODO Auto-generated method stub
		return null;
	}

}
