package competitive.platform.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Biginteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger("10"); // input integer as string
		BigInteger c = BigInteger.valueOf(23); // input integer as number
		BigInteger b = in.nextBigInteger(); // input integer using scanner
		System.out.printf("%d,%d", a, c);
		System.out.println(b.isProbablePrime(1) ? "prime" : "not prime");
		in.close();
	}
}