package assignments;

public class Assign31 {
	

	    public static void main(String[] args) {
	        
	        try {
	            int result = 10 / 0;  
	            System.out.println("Result: " + result); 
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());

	            throw e; 
	        } catch (Exception e) {
	           
	            System.out.println("Caught general exception: " + e.getMessage());
	        }
	    }
	}


}
