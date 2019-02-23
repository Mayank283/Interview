package language.java.concepts;

/**
 * Method Overriding is also called as Dynamic/Runtime Polymorphism.
Overriding is a complex process.
Things to take into consideration:

1) Return type(1.4) from(1.5) Co-variant return type are allowed.

2) Access modifier ex: private methods are not available to child class hence overriding concepts not for private modifier.

3) While overriding we cannot reduce the scope of method.eg.(Public-> Private;Public->default;Public->Protected) is not allowed. 
   However vice-versa is allowed. eg. (Default->Protected;Default->Public;Protected->Public)
   Order of access modifier: (Private<Default<Protected<Public).
   
4) Abstract method in parent class must be implemented in child class.

5) If child class declares parent class method as abstract then it is valid and child class will not have the parent class method.
   This stops availability of parent class method to child class.
   
6) Parent have non-final method can be made final in child class.

7) Synchronize -> non-synchronize and vice-versa allowed. 

8) We can't Override static method as non-static or vice-versa */

public class Overriding {

	public static void m1() {
		System.out.println("Parent static");
	}
}

class OverridingStatic extends Overriding {
/**
 * If both parent and child class method are static then it is known as method hiding and not overriding
   and method resolution is taken by compiler hence below code will give 'Parent Static' for parent reference
   and child object instead of 'child static' */
	public static void m1() {
		System.out.println("Child static");
	}
}