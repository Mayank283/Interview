package algorithm.paradigm.dynamic.programming;


/**
 * Program to find minimum cost to reach from (0,0) to (i,j) in an array of mxn
 * when u can move only in bottom and right direction
 */
public class MinCostArray
{
    public static void main(String[] args)
    {
        int[][] stationArray = {{1, 3, 5, 8}, {4, 2, 1, 7}, {4, 3, 2, 3}};
        MinCostArray minCostStation = new MinCostArray();
        System.out.println(minCostStation.minCostRecursive(stationArray, 2, 3));
        System.out.println(minCostStation.minCostDp(stationArray, 2, 3));
        System.out.println(minCostStation.totalPathDp(stationArray, 2, 3));
    }

    //Top-Down approach
    private int minCostRecursive(int[][] station, int m, int n)
    {
        if (m == 0 && n == 0)
        {
            return station[m][n];
        }
        if (m == 0)
        {
            return station[m][n] + minCostRecursive(station, m, n - 1);
        }
        if (n == 0)
        {
            return station[m][n] + minCostRecursive(station, m - 1, n);
        }
        return station[m][n] + Math.min(minCostRecursive(station, m - 1, n), minCostRecursive(station, m, n - 1));
    }

    //Bottom-up approach
    private int minCostDp(int[][] station, int m, int n)
    {
        int cache[][] = new int[m + 1][n + 1];
        cache[0][0] = station[0][0];

        //fill first row
        for (int i = 1; i <= n; i++)
        {
            cache[0][i] = cache[0][i - 1] + station[0][i];
        }

        //fill first column
        for (int i = 1; i <= m; i++)
        {
            cache[i][0] = cache[i - 1][0] + station[i][0];
        }

        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                cache[i][j] = station[i][j] + Math.min(cache[i - 1][j], cache[i][j - 1]);
            }
        }
        return cache[m][n];
    }

    //method to return all the path from (0,0) to (i,j) in mxn array
    private int totalPathDp(int[][] station, int m, int n)
    {
        int cache[][] = new int[m + 1][n + 1];
        cache[0][0] = 0;

        //fill first row
        for (int i = 1; i <= n; i++)
        {
            cache[0][i] = 1;
        }

        //fill first column
        for (int i = 1; i <= m; i++)
        {
            cache[i][0] = 1;
        }

        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                cache[i][j] = cache[i][j - 1] + cache[i - 1][j];
            }
        }
        return cache[m][n];
    }
}
