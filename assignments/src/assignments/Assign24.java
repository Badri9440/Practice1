package assignments;

public class Assign24 {
	public class MultipleTryCatchFinally {

	    public static void main(String[] args) {
	        handleMultipleExceptions();
	    }

	    public static void handleMultipleExceptions() {
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println("Array element: " + numbers[5]);  // This will throw ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } finally {
	            System.out.println("First finally block executed.");
	        }

	        try {
	            int result = 10 / 0;  
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        } finally {
	            System.out.println("Second finally block executed.");
	        }

	        try {
	            String str = null;
	            System.out.println("String length: " + str.length()); 
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        } finally {
	            System.out.println("Third finally block executed.");
	        }

	        System.out.println("Program execution continues after all exception handling.");
	    }
	}


}
