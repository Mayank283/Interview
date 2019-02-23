/**
 * 
 */
package language.java.reflection;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author mayank
 *
 */
@Documented
@Retention(RUNTIME)
@Target(java.lang.annotation.ElementType.TYPE)
public @interface Mayank {
	String name = "mayank";

	String value();
}
