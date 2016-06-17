package concept;

/**
 * Based on Automatic promotion or implicit type casting char(2 byte)->int(4 byte)->long(8 byte)->float(4 byte)->double(8 byte)

 * byte(1)->short(2)->int(4)->long(8)->float(4)->double(8) String->Object
 
 * between int and int... method int will get priority and int... has least priority
 */

public class Overloading {

	public static void main(String[] args) {
		Overloading t = new Overloading();
		t.m1('a');
		t.m1(new Overloading());
		t.m1(null);
	}

	public int m1(int x) {
		System.out.println("int args");
		return 10;
	}

	public void m1(float i) {
		System.out.println("float args");
	}

	public void m1(String i) {
		System.out.println("String args");
	}

	public void m1(Object x) {
		System.out.println("object args");

	}
}