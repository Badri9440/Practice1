package assignments;


	class Animal {
	    String type = "Animal";

	    public void eat() {
	        System.out.println("Animal eats food.");
	    }
	}

	class Mammal extends Animal {
	    public void walk() {
	        System.out.println("Mammal walks.");
	    }
	}

	class Dog extends Mammal {
	    public void bark() {
	        System.out.println("Dog barks.");
	    }
	}

	public class Assign40 {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();

	        System.out.println("Type: " + myDog.type); 
	        myDog.eat();  
	        myDog.walk(); 
	        myDog.bark(); 
	    }
	}



