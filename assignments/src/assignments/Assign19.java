package assignments;

public class Assign19 {
	
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0;  
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }

	        System.out.println("Program execution continues...");
	    }
	}



