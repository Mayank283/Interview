/**
 * 
 */
package language.java.concepts;

/**
 * @author Mayank
 *
 */
public class TryCatchFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(method1());
		System.out.println(method2());
		System.out.println(method3());
		System.out.println(method4());
		System.out.println("Calling method5():: " + method5());
	}

	// try with return and no exception then Finally->try
	public static int method1() {

		try {
			return 1;
		} catch (Exception e) {
			return 3;
		}

		finally {
			System.out.println("Finally");
		}
	}

	// try with exception and catch return then Finally->catch
	public static int method2() {

		try {
			throw new Exception();
		} catch (Exception e) {
			return 3;
		}

		finally {
			System.out.println("Finally");
		}
	}

	// try with exception and catch not return then catch->finally
	public static int method3() {

		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("In catch");
		}

		finally {
			System.out.println("Finally");
		}
		return 0;
	}

	// try with return and no exception and finally return then only finally
	public static int method4() {

		try {

			return 1;

		} catch (Exception e) {
			return 3;
		}

		finally {
			return 4;
		}
	}

	// method to experiment above rules
	public static int method5() {

		try {
			if ("a".equals("b"))
				return 1;
			else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("inside catch!");
		}

		finally {
			System.out.println("finally called!");
		}
		return 0;
	}
}
