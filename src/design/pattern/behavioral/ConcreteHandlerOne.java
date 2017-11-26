/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class ConcreteHandlerOne extends CORHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.CORHandler#handleRequestImpl(design.pattern.
	 * behavioral.CORRequest)
	 */
	@Override
	public boolean handleRequestImpl(CORRequest request) {
		if (request.getDescription().equals("Software Engineer")) {
			System.out.println("Handled by HandlerOne");
			return true;
		} else {
			return false;
		}
	}
}
