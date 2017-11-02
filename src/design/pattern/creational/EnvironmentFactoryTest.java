/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 *
 */
public class EnvironmentFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Environment env = EnvironmentFactory.getEnvironment(EnvironmentEnum.FIT.toString());
		env.envType();
	}
}