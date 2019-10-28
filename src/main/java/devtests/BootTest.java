/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package devtests;

import org.topicquests.os.asr.AsrCoreEnvironment;

/**
 * @author jackpark
 *
 */
public class BootTest {
	private AsrCoreEnvironment environment;
	/**
	 * 
	 */
	public BootTest() {
		environment = new AsrCoreEnvironment();
		System.out.println(environment.getProperties());
		environment.shutDown();
		System.exit(0);
	}

}
