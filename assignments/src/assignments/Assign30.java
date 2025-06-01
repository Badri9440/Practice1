package assignments;


	
	class Assign301 extends Exception {
	    public Assign301(String message) {
	        super(message); 
	    }
	}

	public class Assign30 {

	    public static void main(String[] args) {

	        try {
	            // Outer try block
	            System.out.println("Outer try block started.");

	            try {
	                // Inner try block
	                System.out.println("Inner try block started.");

	                int result = 10 / 0; // This will cause ArithmeticException (division by zero)
	                System.out.println("Result: " + result);

	            } catch (ArithmeticException e) {
	                // Catch exception from inner try block
	                System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
	                
	                // Raising a custom exception from inner catch block
	                throw new Assign301("Custom exception raised from inner catch block.");
	            }

	            System.out.println("Outer try block continues after inner try-catch.");

	        } catch (Assign301 e) {
	            // Catch the custom exception raised in the inner catch block
	            System.out.println("Caught Assign30 exception in outer catch block: " + e.getMessage());
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



