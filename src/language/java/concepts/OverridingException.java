package language.java.concepts;

import java.io.EOFException;
import java.io.IOException;

/**
 * If 'Child class' throws 'Checked Exception' then 'Parent Class' should throw
 * same Checked Exception or Parent Checked Exception If 'Child class' throws
 * 'Unchecked Exception' then 'Parent Class' may or may not throw
 * Checked/Unchecked Exception. Runtime Exeptions and Error(File not
 * found,Stackoverflow) are called unchecked exceptions while all other are
 * checked exceptions
 * 
 */

public class OverridingException {
	public void m1() throws IOException {
		System.out.println("Parent class");
	}
}

/**
 * Compile time error for below code
 */
class OverridingChildOne extends OverridingException {
	public void m1() throws EOFException /** ,InterruptedException */
	{
		System.out.println("Child class");
	}
}