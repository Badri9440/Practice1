package assignments;


	public class Assign35 {

	    private String name;
	    private int age;

	   	    public Assign35(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age >= 0 && age <= 120) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Please enter a valid age between 0 and 120.");
	        }
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + getName());
	        System.out.println("Age: " + getAge());
	    }

	    public static void main(String[] args) {
	        Assign35 person = new Assign35("John", 25);

	        System.out.println("Using getter methods: ");
	        System.out.println("Person's Name: " + person.getName());
	        System.out.println("Person's Age: " + person.getAge());

	        person.setAge(30);  
	        person.setName("Alice");

	        System.out.println("\nAfter updating using setter methods: ");
	        System.out.println("Person's Name: " + person.getName());
	        System.out.println("Person's Age: " + person.getAge());

	        person.displayDetails(); 

	        person.setAge(130);  
	    }
	}



