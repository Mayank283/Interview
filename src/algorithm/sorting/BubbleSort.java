package algorithm.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]) {

		int[] a = new int[5];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		in.close();

		a = bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

	private static int[] bubbleSort(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		return a;
	}
}