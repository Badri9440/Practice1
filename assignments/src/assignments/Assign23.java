package assignments;

public class Assign23 {
	
	

	    public static void main(String[] args) {
	        try {
	            throw new NullPointerException("This is a manually thrown NullPointerException.");
	        } catch (NullPointerException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



