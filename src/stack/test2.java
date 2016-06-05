package stack;

public class test2 {
	public void m1(String i){
		System.out.println("String args");
	}	
	public void m1(Object x){
		System.out.println("object args");
	//	System.out.println(x);;
	}	
	public static void main(String[] args) {
			test2 t = new test2();
			t.m1(new test2());
			t.m1(null);
			
	}
}