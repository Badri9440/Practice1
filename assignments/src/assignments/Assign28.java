package assignments;


	
	class Assign281 extends Exception {
	    public Assign281(String message) {
	        super(message); 
	    }
	}

	public class Assign28 {

	    public static void checkAge(int age) throws Assign281 {
	        if (age < 18) {
	            throw new Assign281 ("Age must be 18 or older. Provided age: " + age);
	        } else {
	            System.out.println("Age is acceptable. Welcome!");
	        }
	    }

	    public static void main(String[] args) {
	        int userAge = 16; 

	        try {
	            checkAge(userAge);
	        } catch (Assign281  e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



