/**
 * 
 */
package language.java.reflection;

/**
 * @author Mayank
 *
 */
public class Car extends AbstractFourWheeler implements Vehicle {

	private int wheels;

	private String carName;

	private String color;

	private Engine engine;

	/**
	 * @param engine
	 */
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Car() {

	}

	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	public Engine getEngine() {
		return engine;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param carName
	 *            the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @param wheels
	 *            the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public int upGear(int gear) {
		return ++gear;
	}

	@Override
	public Long move() {
		Long distance = 1000L;
		return distance;
	}
}
