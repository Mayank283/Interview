/**
 * 
 */
package design.pattern.structural;

/**
 * @author mayank
 *
 */
public abstract class InputStreamDecorator implements Stream {

	public Stream stream;
	
	public InputStreamDecorator(Stream stream) {
		this.stream = stream;
	}
	
}
