package language.java.concepts;

/**
 * Order of Execution 
 * -> Identification of static members from top to bottom
 * -> Execution of static variables assignment and static blocks from top to bottom
 * -> Execution of main method 
 * 
 * Remember Read Indirectly Write Only(from method) and Read and write (from static blocks) 
 * Use: Loading native library during the class loading ex. Every dbclass has static block to register driver
 * Important from java1.7 main method is necessary to start program execution */


public class StaticBlock {

	static int i = 10;
	static{
		m1();
		System.out.println("First static block");
		System.out.println(i);
		//System.exit(0); /**To print without main method and no runtime exception*/
		//registerDriverClass(); /**Loading the native library*/
		//System.out.println(j); /**Cannot read directly:CE*/
	}
	
	public static void main(String[] args) {
			m1();
			System.out.println("Main method");
	}

	/**
	 * Read indirectly*/
	private static void m1() {
		System.out.println(j);	
	}
	
	static int j =20;
}