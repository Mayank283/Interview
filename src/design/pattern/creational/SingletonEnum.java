/**
 * 
 */
package design.pattern.creational;

/**
 * @author Mayank
 *
 *         Creating a Singleton class using Enum is the best way as no
 *         synchronization is required,enum are serializable,destruction by
 *         reflection is solved.
 */
public enum SingletonEnum {

	// Fixed type of singleton classes with parameter through enum
	INSTANCE1("value1", new Metrics1()), INSTANCE2("value2", new Metrics2()), INSTANCE3("value3");

	String value;

	Metrics metrics;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the metrics
	 */
	public Metrics getMetrics() {
		return metrics;
	}

	/**
	 * @param metrics
	 *            the metrics to set
	 */
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	// Create constructor for these classes
	SingletonEnum(String value, Metrics metric) {
		this.value = value;
		this.metrics = metric;
	}

	private SingletonEnum(String value) {
		this.value = value;
	}

	public static SingletonEnum getClassBasedOnValue(String value) {
		for (SingletonEnum element : SingletonEnum.values()) {
			if (element.getValue().equals(value)) {
				return element;
			}
		}
		return null;
	}
}

abstract class Metrics {

	public abstract String returnProperty();

}

class Metrics1 extends Metrics {

	@Override
	public String returnProperty() {
		return "MetricsOneProperty";
	}

}

class Metrics2 extends Metrics {

	@Override
	public String returnProperty() {
		return "MetricsTwoProperty";
	}
}