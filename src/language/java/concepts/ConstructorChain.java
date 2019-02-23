package language.java.concepts;

public class ConstructorChain extends ConstructorChaining {

	ConstructorChain(int x){
		System.out.println("Creating Child after parent...");
		System.out.println("Completed creating child!");
	}
	
	ConstructorChain(){
		
	}
	
	public static void main(String[] args) {
		new ConstructorChain();
		new ConstructorChain(5);
	}
}