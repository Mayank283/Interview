package concept;

public class StringFormater {

	public static void main(String[] args) {
		String id = "1";
		String s = String.format("%05d", Integer.parseInt(id));
		System.out.println(s);
		System.out.printf("%10s",id);
	}
}