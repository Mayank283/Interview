package competitive.platform.hackerrank;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i <= array.length; i++) {
			
			for (int j = 0; j < array.length - i; j++) {
				
				int l = j, k = 0, sum = 0;
				
				while (k++ <= i) {
					
					sum = sum + array[l++];
				}
		
				if (sum < 0)
					count++;
			}
		}
		System.out.println(count);
	}
}