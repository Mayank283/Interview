package hackerrank;

import java.util.Scanner;

public class ScannerCon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Double d = scan.nextDouble();
		//scan.nextLine();
		String s = scan.nextLine();
		System.out.println(s);
		scan.close();
	}
}
