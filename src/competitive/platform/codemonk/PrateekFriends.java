package competitive.platform.codemonk;

import java.util.Scanner;

public class PrateekFriends {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {
			int friends = in.nextInt();
			int cost = in.nextInt();
			int[] array = new int[friends];
			for (int i = 0; i < friends; i++) {
				array[i] = in.nextInt();
			}
			int temp=0;
			String result = "NO";
			for (int j = 0; j < array.length; j++) {
				temp = cost;
				if (result == "YES") {
					break;
				}
				for (int i = j; i < array.length; i++) {
					temp = temp - array[i];
					if (temp < 0) {
						break;
					}
					if (temp == 0) {
						result="YES";
						break;
					}
				}
			}
			System.out.println(result);
			t--;
		}
		in.close();
	}

	public static String method(int[] array, int cost) {
		int temp;
		String result = "NO";

		for (int j = 0; j < array.length; j++) {
			temp = cost;
			if (result == "YES") {
				break;
			}
			for (int i = j; i < array.length; i++) {
				temp = temp - array[i];
				if (temp < 0) {
					break;
				}
				if (temp == 0) {
					result="YES";
					break;
				}
			}
		}
		return null;
	}
}