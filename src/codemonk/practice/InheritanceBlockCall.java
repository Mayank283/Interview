package codemonk.practice;

public class InheritanceBlockCall
{
    public static void main(String[] args)
    {
        Green green = new Green();
    }
}

class Color
{

    static
    {
        System.out.println("from Parent");
    }

    {
        System.out.println("Parent Intializer");
    }

    public Color()
    {
        System.out.println("Parent constructor");
    }
}

class Green extends Color
{

    static
    {
        System.out.println("from child");
    }

    {
        System.out.println("Green child Intializer!!");
    }

    public Green()
    {
        System.out.println("Green constructor");
    }
}