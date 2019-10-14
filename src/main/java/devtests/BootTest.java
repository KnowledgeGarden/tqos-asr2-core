/**
 * 
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
