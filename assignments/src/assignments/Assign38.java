package assignments;


	class Vehicle {
	    public void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	class Car extends Vehicle {
	    public void drive() {
	        System.out.println("Car is driving...");
	    }
	}

	class Engine {
	    public void run() {
	        System.out.println("Engine is running...");
	    }
	}

	class Truck extends Vehicle {
	    private Engine engine; 

	    public Truck() {
	        engine = new Engine(); 
	    }

	    public void operateTruck() {
	        System.out.println("Truck is being operated...");
	        engine.run();  
	    }
	}

	public class Assign38 {
	    public static void main(String[] args) {
	        System.out.println("=== IS-A Relationship ===");
	        Car myCar = new Car();
	        myCar.start();   
	        myCar.drive();   

	        System.out.println("\n=== HAS-A Relationship ===");
	        Truck myTruck = new Truck();
	        myTruck.start();        
	        myTruck.operateTruck();  
	    }
	}



