/**
 * 
 */
package reflection;

/**
 * @author Mayank
 *
 */
public class Engine {

	String power;

	/**
	 * @return the power
	 */
	public String getPower() {
		return power;
	}

	/**
	 * @param power
	 *            the power to set
	 */
	@EnginePower(power = "200HP")
	public void setPower(String power) {
		this.power = power;
	}
}
