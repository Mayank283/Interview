package dynamic.programming;

/**
 * Print T/F if given Sum of N is possible from given array of A
 * Ex. array = {2,3,7,8,10}, sum = 11,14,10
 * ans : true {8,3}, false, true {3,7} & {10}
 * <p>
 * This problem is very similar to 0-1 Knapsack
 */
public class SubsetSum
{
    public static void main(String[] args)
    {
        SubsetSum subsetSum = new SubsetSum();
        int sum = 2;
        int[] array = new int[] { 2, 3, 7, 8, 10 };
        System.out.println(subsetSum.isSubsetSumDp(array, sum));
    }

    private boolean isSubsetSumDp(int[] array, int sum)
    {
        boolean[][] cache = new boolean[array.length][sum + 1];

        //fill first column with true as sum of 0 is always possible by null set
        for (int i = 0; i < array.length; i++)
        {
            cache[i][0] = true;
        }

        //fill first row
        for (int i = 1; i <= sum; i++)
        {
            cache[0][i] = i - array[0] == 0 ? true : false;
        }
        for (int row = 1; row < array.length; row++)
        {
            for (int column = 1; column <= sum; column++)
            {
                cache[row][column] = column - array[row] >= 0 ?
                        cache[row - 1][column] || cache[row - 1][column - array[row]] :
                        cache[row - 1][column];
            }
        }
        boolean result = cache[array.length - 1][sum];

        if (result)
        {
            displaySelected(cache, array);
        }
        return result;
    }

    private void displaySelected(boolean[][] cache, int[] array)
    {
        int row = cache.length - 1;
        int column = cache[0].length - 1;
        while (column != 0)
        {
            if (row != 0 && cache[row - 1][column])
            {
                row = row - 1;
            } else
            {
                column = column - array[row];
                System.out.println(array[row]);
            }
        }
    }
}
