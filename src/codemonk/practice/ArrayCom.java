package codemonk.practice;

public class ArrayCom {

	public static void main(String[] args) {

		int [] array={1,2,3,4};
		printCombination(array, array.length, 3);
	}

	public static void printCombination(int[] array, int n, int r) {

		int[] data = new int[r];

		combination(array, n, r, 0, data, 0);
	}

	public static void combination(int[] array, int n, int r, int index, int[] data, int i) {

		if (index == r) {
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[j] + " ");
			}
			System.out.println();
			return;
		}

		if (i >= n) {
			return;
		}

		data[index] = array[i];
		combination(array, n, r, index + 1, data, i + 1);

		combination(array, n, r, index, data, i + 1);
	}
}