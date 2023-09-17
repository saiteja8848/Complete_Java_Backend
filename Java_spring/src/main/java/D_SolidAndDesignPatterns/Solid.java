package D_SolidAndDesignPatterns;


/**
 * 
 * 
 * 
 * @author saiteja
 * 
 * S - single responsibility principle:
 * 
 * Every class should have a single responsibility. 
 * There should never be more than one reason for a class to change.
 * 
 * 
 * O - Open/closed principle - open for extension and closed for modification
 * Software entitites should be open for extension, but closed for modification
 * 
 * 
 * 
 * L - Liskov substitution principle
 *     Functions that use pointers or references
 *      to base classes must be able to use objects of derived classes without knowing it.
 * 
 * 
 * 
 * I - Interface segregation principle
 * 		Clients should not be forced to depend on interfaces they do not use.
 * 
 * 
 * D - Dependency Injection principle
 * 		High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * 		Abstractions should not depend on details. Details should depend on abstractions.


 * 
 * 
 *
 */
 class Vehicle {
    public void printDetails() {}
    public double calculateValue() {
		return 0;}
    public void addVehicleToDB() {}
}

public class Solid {
	
	
	
	// Open closed
	
//	public class VehicleCalculations {
//	    public double calculateValue(Vehicle v) {
//	        if (v instanceof Car }) {
//	            return v.getValue() * 0.8;
//	        if (v instanceof Bike) {
//	            return v.getValue() * 0.5;
//
//	    }
//	}
	
	// On new requirement
//	public class Vehicle {
//	    public double calculateValue() {...}
//	}
//	public class Car extends Vehicle {
//	    public double calculateValue() {
//	        return this.getValue() * 0.8;
//	}
//	public class Truck extends Vehicle{
//	    public double calculateValue() {
//	        return this.getValue() * 0.9;
//	}
	
	
	
	// Interface segration example :
	public interface Vehicle {
	    public void drive();
	    public void stop();
	    public void refuel();
	    public void openDoors();
	}
	public class Bike implements Vehicle {

	    // Can be implemented
	    public void drive() {}
	    public void stop() {}
	    public void refuel() {}
	    
	    // Can not be implemented
	    public void openDoors() {}
	}
	
	
	//BAD DI
	
//	public class Car {
//	    private Engine engine;
//	    public Car(Engine e) {
//	        engine = e;
//	    }
//	    public void start() {
//	        engine.start();
//	    }
//	}
//	public class Engine {
//	   public void start() {...}
//	}
	
	
	// Correct code of DI
	public interface Engine {
	    public void start();
	}
	
	public class Car {
	    private Engine engine;
	    public Car(Engine e) {
	        engine = e;
	    }
	    public void start() {
	        engine.start();
	    }
	}
	public class PetrolEngine implements Engine {
	   public void start() {}
	}
	public class DieselEngine implements Engine {
	   public void start() {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
