package assignments;


	class Student {
	    String name;

	    public Student() {
	        this.name = "Unknown";
	    }

	    public Student(String name) {
	        this.name = name;
	    }

	    public void printName() {
	        System.out.println("Student name: " + name);
	    }
	}

	// Main class
	public class Assign41 {
	    public static void main(String[] args) {
	        Student s1 = new Student();            
	        Student s2 = new Student("Rahul");      

	        s1.printName(); 
	        s2.printName(); 
	    }
	}



