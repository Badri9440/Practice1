package assignments;


	
	class Assign26 extends Exception {
	    public MyCheckedException(String message) {
	        super(message);
	    }
	}

	public class ThrowCheckedExceptionExample {

	    public static void throwCheckedException() throws MyCheckedException {
	        throw new MyCheckedException("This is a manually thrown checked exception.");
	    }

	    public static void main(String[] args) {
	        try {
	            throwCheckedException();
	        } catch (MyCheckedException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



