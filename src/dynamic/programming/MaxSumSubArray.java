package dynamic.programming;

/**
 * Print the maximum sum sub-array such that all elements are contiguous
 * Ex. {-2,-3,4,-1,-2,1,5,-3} then {4,-1,-2,1,5} results in 7
 */
public class MaxSumSubArray
{
    public static void main(String[] args)
    {
        MaxSumSubArray maxSumArray = new MaxSumSubArray();
        int[] array = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSumArray.maximumSumSubArray(array));
    }

    //returns maximum sum subarray
    private int maximumSumSubArray(int[] array)
    {
        int sum = 0, currentSum = 0;

        {
            for (int i = 0; i < array.length; i++)
            {
                currentSum += array[i];

                if (currentSum < 0)
                {
                    currentSum = 0;
                }

                if (currentSum > sum)
                {
                    sum = currentSum;
                }
            }
        }

        return sum;
    }
}
