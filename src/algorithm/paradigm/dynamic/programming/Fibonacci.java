package algorithm.paradigm.dynamic.programming;

/**
 * Prints the fibonacci number at nth position.
 * fibonacci series: 0 1 1 2 3 5 8 13....
 */
public class Fibonacci
{
    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fiboRecursion(47));
        System.out.println(fibonacci.fiboMemoization(47));
        System.out.println(fibonacci.fiboDp(47));
    }

    //It is a top-down approach
    public int fiboRecursion(int number)
    {
        if (number == 1)
        {
            return 0;
        }
        if (number == 2 || number == 3)
        {
            return 1;
        }
        return fiboRecursion(number - 2) + fiboRecursion(number - 1);
    }

    //Memoization is just an improvement over recursion to save recalculating values
    public int fiboMemoization(int number)
    {
        Integer[] cache = new Integer[number + 1];
        cache[1] = 0;
        cache[2] = 1;
        return fiboMemoization(number, cache);
    }

    private int fiboMemoization(int number, Integer[] cache)
    {
        if (cache[number] != null)
        {
            return cache[number];
        }

        cache[number] = fiboRecursion(number - 2) + fiboRecursion(number - 1);

        return cache[number];
    }

    //Dynamic Programming is a bottom-up approach moving from source to destination
    public int fiboDp(int number)
    {
        int a = 0;
        int b = 1;
        int n = 0;

        for (int i = 1; i <= number - 2; i++)
        {
            n = a + b;
            a = b;
            b = n;
        }
        return n;
    }
}
