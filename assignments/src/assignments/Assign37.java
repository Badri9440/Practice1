package assignments;


	
	class Animal {
	   
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }

	    
	    public final void breathe() {
	        System.out.println("Animal breathes air");
	    }

	    // Static method (method hiding, not overriding)
	    public static void sleep() {
	        System.out.println("Animal sleeps");
	    }
	}

	
	class Dog extends Animal {

	   
	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks");
	    }

	  
	    public static void sleep() {
	        System.out.println("Dog sleeps quietly");
	    }
	}

	
	public class Assign37 {
	    public static void main(String[] args) {
	        Animal myAnimal = new Dog();

	        myAnimal.makeSound();

	        myAnimal.breathe();

	        myAnimal.sleep();  // Animal's sleep() is called, not Dog's



	    }
	    
	}
