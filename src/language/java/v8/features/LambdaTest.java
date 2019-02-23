package language.java.v8.features;

public class LambdaTest
{

    public static void main(String[] args)
    {

        LambdaTest lm = new LambdaTest();
        lm.test();
    }

    public void test()
    {
        LambdaTest lt = new LambdaTest();
        /**Give the parameter required by the functional Interface method
         and the implementation of it*/
        lt.subscribe(string -> string.equals("Mayank"));
    }

    public void subscribe(LambdaExp lambda)
    {
        System.out.println(lambda.printName("Mayak"));
    }
}