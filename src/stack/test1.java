package stack;

/**In short compiler jo order follow karta h wo ye h,  char -  int -  long -  float -  double*/

public class test1 {

	public static void main(String[] args) {
		
		test1 t = new test1();
		t.m1('a');

	}
	
	public int m1(int x) {
		System.out.println("int args");
		return 10;
	}

	public void m1(float i) {
		System.out.println("float args");
	}
}