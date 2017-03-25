package lambda;

public class LambdaTest {

	private String name;

	public static void main(String[] args) {

		LambdaTest lm = new LambdaTest();
		lm.test();
	}

	public void test() {
		LambdaTest lt = new LambdaTest();
		   /**Give the parameter required by the functional Interface method 
		and the implementation of it*/
		lt.subscribe(name -> {
			this.name = name;
			return this.name;
		});
	}

	public void subscribe(LambdaExp lambda) {
		System.out.println(lambda.printName("Mayank"));
	}
}