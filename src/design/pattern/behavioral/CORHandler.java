/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 * 
 *         Chain of responsibility(COR) pattern consists of a Handler Interface
 *         which provides method handle request for all the handler. Base
 *         interface will also contain the reference to next handler in case
 *         present handler cannot handle the current request. Difference between
 *         COR and Strategy pattern is that in strategy client know about all
 *         the algorithms of server. Examples in Java can be found in Filters
 *         and in Spring security where all the Authentication providers
 *         delegates the request to next handler in case it cannot handle it.
 * 
 */
public abstract class CORHandler {

	private CORHandler corHandler;

	public void handleRequest(CORRequest request) {

		boolean handled = this.handleRequestImpl(request);

		if (!handled) {
			if (getSuccessor() != null) {
				getSuccessor().handleRequest(request);
			} else {
				System.out.println("Unhandled request!!");
			}
		}
	}

	public abstract boolean handleRequestImpl(CORRequest request);

	public void setSuccessor(CORHandler handler) {
		this.corHandler = handler;
	}

	public CORHandler getSuccessor() {
		return corHandler;
	}
}
