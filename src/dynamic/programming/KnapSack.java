package dynamic.programming;

public class KnapSack
{
    public static void main(String[] args)
    {
        KnapSack knapSack = new KnapSack();
        int[] weight = {1, 3, 4, 5};
        int[] value = {1, 4, 5, 5};
        System.out.println(knapSack.knapSackDp(weight, value, 8));

        weight = new int[]{1, 3, 4, 5};
        value = new int[]{1, 4, 5, 7};
        System.out.println(knapSack.knapSackDp(weight, value, 7));

        weight = new int[]{2, 3, 4, 5};
        value = new int[]{3, 4, 5, 6};
        System.out.println(knapSack.knapSackDp(weight, value, 5));
    }

    private int knapSackDp(int[] weight, int[] value, int capacity)
    {
        int[][] cache = new int[weight.length + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++)
        {
            cache[0][i] = 0;
        }
        for (int i = 1; i <= weight.length; i++)
        {
            cache[i][0] = 0;
        }

        for (int i = 1; i <= weight.length; i++)
        {
            for (int j = 1; j <= capacity; j++)
            {
                if (j - weight[i - 1] >= 0)
                {
                    cache[i][j] = Math.max(value[i - 1] + cache[i - 1][j - weight[i - 1]], cache[i - 1][j]);
                } else
                {
                    cache[i][j] = cache[i - 1][j];
                }
            }
        }
        displaySelected(cache, weight.length, capacity, weight);
        System.out.println();
        return cache[weight.length][capacity];
    }

    private void displaySelected(int[][] cache, int row, int column, int[] weight)
    {
        while (cache[row][column] != 0)
        {
            if (cache[row][column] == cache[row - 1][column])
            {
                row = row - 1;
            } else
            {
                column = column - weight[row - 1];
                System.out.print(weight[row - 1] + " ");
            }
        }
    }
}

