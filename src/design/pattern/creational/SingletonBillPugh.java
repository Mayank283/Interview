package design.pattern.creational;

/**Most widely used Method to create a singleton class*/

public class SingletonBillPugh {

    private SingletonBillPugh(){}
    
    private static class SingletonHelper{
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
    
    public static SingletonBillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }
}