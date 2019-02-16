package dynamic.programming;


/**
 * Total ways to achieve a total of N using numbers are 3,5,10
 */
public class SumCombination
{
    public static void main(String[] args)
    {
        SumCombination sumCombination = new SumCombination();
        System.out.println(sumCombination.totalWaysRecursive(100));
        System.out.println(sumCombination.totalWaysDp(100));
    }

    //Top-Down approach
    private int totalWaysRecursive(int number)
    {
        if (number == 0)
        {
            return 1;
        }

        if (number < 0)
        {
            return 0;
        }
        return totalWaysRecursive(number - 3) + totalWaysRecursive(number - 5) + totalWaysRecursive(number - 10);
    }

    //Bottom-up approach
    private int totalWaysDp(int number)
    {
        int[] cache = new int[number + 1];
        cache[0] = 1;
        for (int i = 1; i <= number; i++)
        {
            if (i - 3 >= 0)
            {
                cache[i] += cache[i - 3];
            }

            if (i - 5 >= 0)
            {
                cache[i] += cache[i - 5];
            }
            if (i - 10 >= 0)
            {
                cache[i] += cache[i - 10];
            }
        }
        return cache[number];
    }
}
