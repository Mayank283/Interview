/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class ConcreteHandlerThree extends CORHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * design.pattern.behavioral.CORHandler#handleRequest(design.pattern.behavioral.
	 * CORRequest)
	 */
	@Override
	public boolean handleRequestImpl(CORRequest request) {
		if (request.getDescription().equals("Manager")) {
			System.out.println("Handled by HandlerThree");
			return true;
		} else {
			return false;
		}
	}
}
