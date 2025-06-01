package assignments;


	
	public class Assign36 {

	    public void printDetails(String name) {
	        System.out.println("Name: " + name);
	    }

	    public void printDetails(String name, int age) {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public void printDetails(String name, double salary) {
	        System.out.println("Name: " + name + ", Salary: " + salary);
	    }

	    // Overloaded method with no parameters
	    public void printDetails() {
	        System.out.println("No details provided.");
	    }

	    public static void main(String[] args) {
	        Assign36 obj = new Assign36();

	        obj.printDetails("John");              
	        obj.printDetails("Alice", 30);          
	        obj.printDetails("Bob", 50000.50);       
	        obj.printDetails();                    
	    }
	}



