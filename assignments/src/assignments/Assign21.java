package assignments;

public class Assign21 {
	
	

	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0;  
	            System.out.println("Result: " + result); 
	        } finally {
	            try {
	               
	                int result = 10 / 0;  
	            } catch (ArithmeticException e) {
	                
	                System.out.println("Caught exception in finally block: " + e.getMessage());
	            }
	            
	            System.out.println("Finally block execution completed.");
	        }

	        System.out.println("Program execution continues after finally block.");
	    }
	}



