package concept;


/**In the case of composition, the Engine is completely encapsulated by the Car. 
 * There is no way for the outside world to get a reference to the Engine. 
 * The Engine lives and dies with the car.*/

public class Composition {

}
final class Car {

	  private final Engine engine;

	  Car(EngineSpecs specs) {
	    engine = new Engine(specs);
	  }

	  void move() {
	    engine.work();
	  }
	}