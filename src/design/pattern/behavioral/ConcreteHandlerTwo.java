/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class ConcreteHandlerTwo extends CORHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * design.pattern.behavioral.CORHandler#handleRequest(design.pattern.behavioral.
	 * CORRequest)
	 */
	@Override
	public boolean handleRequestImpl(CORRequest request) {
		if (request.getDescription().equals("Team Lead")) {
			System.out.println("Handled by HandlerTwo");
			return true;
		} else {
			return false;
		}
	}
}
