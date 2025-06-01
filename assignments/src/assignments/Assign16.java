package assignments;



	abstract class Animal {
	    void eat() {
	        System.out.println("Animal eats food.");
	    }

	    abstract void makeSound();
	}

	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Dog barks.");
	    }
	}

	// Main class to test
	public class Assign16 {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.eat();         
	        d.makeSound();   
	    }
	}



