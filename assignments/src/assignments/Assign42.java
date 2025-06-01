package assignments;


	class Parent {
	    public Parent() {
	        System.out.println("Parent constructor called.");
	    }
	}

	class Assign42 extends Parent {
	    String name;

	    public Assign42() {
	        this("Default Name"); // this() statement for constructor chaining
	        System.out.println("No-arg constructor of Assign42 called.");
	    }

	    public Assign42(String name) {
	        super(); // Calls Parent constructor
	        this.name = name; // this keyword
	        System.out.println("Parameterized constructor of Assign42 called. Name: " + this.name);
	    }

	    public void display() {
	        System.out.println("Using this: Name is " + this.name);
	        System.out.println("Using super: Class name is " + super.getClass().getSimpleName());
	    }

	    public static void main(String[] args) {
	        Assign42 obj = new Assign42();
	        obj.display();
	    }
	}


