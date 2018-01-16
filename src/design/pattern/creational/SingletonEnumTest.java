package design.pattern.creational;

public class SingletonEnumTest {

	public static void main(String[] args) {

		SingletonEnum s1 = SingletonEnum.getClassBasedOnValue("value1");
		SingletonEnum s2 = SingletonEnum.getClassBasedOnValue("value3");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.getMetrics().returnProperty());
	}
}