package assignments;


	
	abstract class Animal {
	    
	    String name = "Unknown Animal";

	    
	    abstract void sound();

	    
	    void displayInfo() {
	        System.out.println("Animal name: " + name);
	    }
	}

	
	class Dog extends Animal {
	    
	    Dog(String name) {
	        this.name = name;
	    }

	    
	    void sound() {
	        System.out.println(name + " says: Woof!");
	    }
	}

	
	public class Assign14 {
	    public static void main(String[] args) {
	       
	        Dog myDog = new Dog("Buddy");

	        myDog.displayInfo();  
	        myDog.sound();        
	    }
	}



