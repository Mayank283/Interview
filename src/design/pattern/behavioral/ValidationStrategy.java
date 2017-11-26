/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 *         In strategy pattern different algorithms are executed for a context
 *         object(CardContext). These algorithms are chosen at runtime to be
 *         executed. In Java Collections.sort(T,Comparator<T>) is based on the
 *         strategy pattern. It helps in encapsulating multiple if-else and thus
 *         apply algorithm at runtime. Strategy pattern could also be clubbed
 *         with factory which client will call to create his requirement
 *         specific strategy and then apply it.
 * 
 */
@FunctionalInterface
public interface ValidationStrategy {

	public Boolean valid(String name, String number);
}
