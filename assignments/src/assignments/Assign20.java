package assignments;

public class Assign20 {
	

	    public static void main(String[] args) {
	        try {
	            throw new ArithmeticException("Explicitly raising ArithmeticException");
	        } catch (ArithmeticException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



