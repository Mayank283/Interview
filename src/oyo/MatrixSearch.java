package oyo;

public class MatrixSearch
{
    public static void searchSortedMatrix(int[][] matrix, int number)
    {
        int right = matrix[0].length - 1, down = 0, rows = matrix.length - 1;

        while (true)
        {
            if (number == matrix[down][right])
            {
                System.out.printf("%d,%d", down, right);
                return;
            } else if (number < matrix[down][right] && right > 0)
            {
                right--;
            } else if (down < rows)
            {
                down++;
            } else
            {
                System.out.println("not found");
                return;
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] mat = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}};
        searchSortedMatrix(mat, 27);
    }
}
