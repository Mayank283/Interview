/**
 * 
 */
package competitive.platform.codemonk;

/**
 * @author mayank
 *
 */
public class Matrix {

	private int[][] matrix;

	public Matrix(int[][] matrix) {
		super();
		this.matrix = matrix;
	}

	/**
	 * @return the matrix
	 */
	public int[][] getMatrix() {
		return matrix;
	}

	/**
	 * @param matrix
	 *            the matrix to set
	 */
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public void transpose() {

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				swap(this.matrix, i, j);
			}
		}
	}

	public void rotateClockwise() {
		transpose();
		for (int i = 0; i < this.matrix.length; i++) {
			swap(this.matrix[i]);
		}
	}

	public void display() {
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void swap(int[][] arr, int i, int j) {
		arr[i][j] = arr[i][j] + arr[j][i];
		arr[j][i] = arr[i][j] - arr[j][i];
		arr[i][j] = arr[i][j] - arr[j][i];
	}

	private void swap(int[] arr) {
		int length = arr.length;
		for (int i = 0; i <= (length / 2) - 1; i++) {
			if (i < length - 1 - i) {
				arr[i] = arr[i] + arr[length - 1 - i];
				arr[length - 1 - i] = arr[i] - arr[length - 1 - i];
				arr[i] = arr[i] - arr[length - 1 - i];
			}
		}
	}
}