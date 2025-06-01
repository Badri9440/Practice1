package assignments;


	public class Animal {

	    String name;
	    int age;

	    public Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Animal Name: " + name);
	        System.out.println("Animal Age: " + age);
	    }
	}

	class Dog extends Animal {

	    String breed;

	    public Dog(String name, int age, String breed) {
	        super(name, age); 
	        this.breed = breed;
	    }

	    public void displayDogInfo() {
	        displayInfo();  
	        System.out.println("Dog Breed: " + breed);
	    }
	}

	public class Assign34 {

	    public static void main(String[] args) {
	       
	        Dog dog = new Dog("Buddy", 5, "Golden Retriever");

	      
	        dog.displayDogInfo();
	    }
	}



