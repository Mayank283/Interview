/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class CORTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CORHandler one = new ConcreteHandlerOne();
		CORHandler two = new ConcreteHandlerTwo();
		CORHandler three = new ConcreteHandlerThree();
		one.setSuccessor(two);
		two.setSuccessor(three);

		one.handleRequest(new CORRequest("Software Engineer"));
		one.handleRequest(new CORRequest("Team Lead"));
		one.handleRequest(new CORRequest("Manager"));
		one.handleRequest(new CORRequest("Director"));
	}
}
