package dynamic.programming;

/**
 * Program on string based on Dynamic Programming.
 * 1. Longest Common Subsequence
 * ex. given abcdaf, acbcf
 * ans. abcf
 * 2. Longest Common Substring
 * ex. given abcdaf,zbcdf
 * ans. bcd
 * here common subsequence would be. bcdf
 */
public class StringSequence
{
    public static void main(String[] args)
    {
        StringSequence stringSequence = new StringSequence();
        stringSequence.longestCommonSubsequence("abcdaf", "acbcf");
        stringSequence.longestCommonSubstring("acbcf", "abcdaf");
    }

    private void longestCommonSubsequence(String a, String b)
    {
        int row = b.length() + 1;
        int column = a.length() + 1;
        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();

        int[][] matrix = new int[row][column];

        //fill first row
        for (int i = 0; i < column; i++)
        {
            matrix[0][i] = 0;
        }

        //fill first column
        for (int i = 1; i < row; i++)
        {
            matrix[i][0] = 0;
        }

        for (int i = 1; i < row; i++)
        {
            for (int j = 1; j < column; j++)
            {
                if (stringB[i - 1] == stringA[j - 1])
                {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else
                {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }

            }
        }
        displayCommonSubsequence(matrix, row, column, stringB);
    }

    private void longestCommonSubstring(String a, String b)
    {
        int row = b.length() + 1;
        int column = a.length() + 1;
        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();

        int[][] matrix = new int[row][column];

        //fill first row
        for (int i = 0; i < column; i++)
        {
            matrix[0][i] = 0;
        }

        //fill first column
        for (int i = 1; i < row; i++)
        {
            matrix[i][0] = 0;
        }

        for (int i = 1; i < row; i++)
        {
            for (int j = 1; j < column; j++)
            {
                if (stringB[i - 1] == stringA[j - 1])
                {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else
                {
                    matrix[i][j] = 0;
                }
            }
        }
        displayCommonSubString(matrix, row, column, stringB);
    }

    private void displayCommonSubString(int[][] matrix, int row, int column, char[] stringB)
    {
        int max = -1, k = 0, l = 0;
        String s = "";
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                    k = i;
                    l = j;
                }
            }
        }

        while (matrix[k][l] != 0)
        {
            s = stringB[k - 1] + s;
            k--;
            l--;
        }
        System.out.println(s);
    }

    private void displayCommonSubsequence(int[][] matrix, int row, int column, char[] stringB)
    {
        int value = matrix[--row][--column];
        String s = "";
        while (value != 0)
        {
            if (value != matrix[row - 1][column] && value != matrix[row][column - 1])
            {
                row = row - 1;
                column = column - 1;
                s = stringB[row] + s;
                value = value - 1;
            } else if (value == matrix[row - 1][column])
            {
                row = row - 1;
            } else
            {
                column = column - 1;
            }
        }
        System.out.println(s);
    }
}
