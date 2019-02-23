package competitive.platform.codemonk;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] matrix = { {1,2,3,4}, 
						   {5,6,7,8},
						   {9,0,1,2},
						   {3,4,5,6},
						   {7,8,9,1}};
		
		int[][] matrix1 = { {1,2,3}, 
				   		    {8,9,4},
				   		    {7,6,5}};
		spiralTrace(matrix);
		System.out.println("\n");
		spiralTrace(matrix1);
	}

	private static void spiralTrace(int[][] matrix) {

		int row = matrix.length;
		int column = matrix[0].length;
		int size = row * column;
		spiralTrace(matrix, 0, 0, 0, row, column, size);

	}

	public static void spiralTrace(int[][] matrix, int count, int rowStart, int colStart, int row, int column,
			int size) {

		int i = rowStart, j = colStart;

		if (count == size) {
			return;
		}

		// trace first row
		for (; j < column; j++) {
			if (count == size) {
				return;
			} else {
				System.out.print(matrix[i][j] + " ");
				count++;
			}
		}
		j = j - 1;

		// trace last column
		for (i = i + 1; i < row; i++) {
			if (count == size) {
				return;
			} else {
				System.out.print(matrix[i][j] + " ");
				count++;
			}
		}
		i = i - 1;
		j = j - 1;

		// trace last row
		for (; j >= colStart; j--) {
			if (count == size) {
				return;
			} else {
				System.out.print(matrix[i][j] + " ");
				count++;
			}
		}
		j = j + 1;
		i = i - 1;

		// trace first column
		for (; i > rowStart; i--) {
			if (count == size) {
				return;
			} else {
				System.out.print(matrix[i][j] + " ");
				count++;
			}
		}

		spiralTrace(matrix, count, rowStart + 1, colStart + 1, row - 1, column - 1, size);
	}
}