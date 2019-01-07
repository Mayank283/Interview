/**
 * 
 */
package reflection;

/**
 * @author mayank
 *
 */

@Mayank(value = "Nokia")
public class TestAnno {

	public static void main(String[] args) {

		Class<TestAnno> test = TestAnno.class;
		Mayank a = test.getDeclaredAnnotation(Mayank.class);
		System.out.println(a.value());
		System.out.println(Mayank.name);

	}
}
