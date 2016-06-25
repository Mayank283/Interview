package concept;

/**
 * 1) new keyword
 * 
 * 2) newInstance()
 * Test t = (Test)Class.forname("Test").newInstance();
 * 
 * 3) FactoryMethod
 * Runtime r = new Runtime.getRuntime();
 * DateFormat d = DateFormat.getInstance();
 * 
 * 4) Clone()
 * Test t = new Test();
 * Test t1=(Test)t.clone();
 * 
 * 5) Deserialization
 * ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.ser"));
 * Dog d = (Dog)in.readObject(); */
public class ObjectCreation {

}
