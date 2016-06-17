package concept;


/**
 * With aggregation, the Car also performs its functions through an Engine, 
   but the Engine is not always an internal part of the Car. 
 * Engines may be swapped, or even completely removed. 
 * Not only that, but the outside world can still have a reference to the Engine, 
   and tinker with it regardless of whether it's in the Car.*/

public class Aggregation {

}
final class Car1 {

	  private Engine engine;

	  void setEngine(Engine engine) {
	    this.engine = engine;
	  }

	  void move() {
	    if (engine != null)
	      engine.work();
	  }
	}