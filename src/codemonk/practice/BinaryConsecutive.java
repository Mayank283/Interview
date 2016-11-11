package codemonk.practice;

import java.util.Scanner;

public class BinaryConsecutive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0, max = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
			n = n >> 1;
		}
		System.out.println(max);
		in.close();
	}
}