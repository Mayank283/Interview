/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		CardContext cardContext = new CardContext("Mayank", "1234567");

		Boolean b = cardContext.isvalid((name, number) -> {
			return name.equals("Mayank") && number == "1234567";
		});

		System.out.println(b);
		
		Boolean b2 = cardContext.isvalid((name, number) -> {
			return name.equals("Aseem") && number == "1234567";
		});

		System.out.println(b2);
	}
}