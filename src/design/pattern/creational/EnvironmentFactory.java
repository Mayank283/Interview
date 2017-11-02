/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 *
 */
public class EnvironmentFactory {

	public static Environment getEnvironment(String environment) {
		if (environment.equalsIgnoreCase("Dit")) {
			return new EnvironmentDit();
		} else if (environment.equalsIgnoreCase("Fit")) {
			return new EnvironmentFit();
		} else {
			return null;
		}
	}
}
