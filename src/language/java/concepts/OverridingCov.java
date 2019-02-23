package language.java.concepts;

/** Co-variant return type overriding in java from java1.5 (Object->String)
 * Child class should not have return type greater than that of parent class (String->Object:NO)
 * Co-variant return type is allowed only for object type but not for primitive data type (double->int: NO)*/


public class OverridingCov {

	public static Object m1(){
		return null;
	}
}

class OverridingCov1 extends OverridingCov {

	public static String  m1(){
		return null;
	}
}

