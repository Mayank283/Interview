package design.pattern.creational;

/**
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 
 *Singleton classes are created for resources 
 *such as File System, Database connections etc and we should avoid the instantiation 
 *until unless client calls the getInstance method /

/**Thread Safe type*/

public class SingletonClass {

	private static SingletonClass instance;

	private SingletonClass() {
	}

	public static synchronized SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}