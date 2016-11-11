package hackerrank;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		String aTrim=a.substring(1, a.length());
		String bTrim=b.substring(1, b.length());
		
		System.out.println(a.length()+b.length());
		System.out.println(a.compareToIgnoreCase(b)>0 ? "Yes":"No");
		
		a = a.toUpperCase().charAt(0)+aTrim;
		b = b.toUpperCase().charAt(0)+bTrim;
		System.out.println(a+" "+b);
		
		in.close();
	}	
}