/**
 * 
 */
package competitive.platform.codemonk;

/**
 * @author mayank
 *
 */
public class MatrixTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 91, 92, 93 }, { 94, 95, 96, 97 } };
		Matrix m = new Matrix(matrix);
		m.display();
		m.rotateClockwise();
		m.display();
		m.rotateClockwise();
		m.display();
		m.rotateClockwise();
		m.display();
		m.rotateClockwise();
		m.display();
	}
}
