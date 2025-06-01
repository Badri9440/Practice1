package assignments;


	
	public class Assign32 {

	   
	    public static void executeMethod(int num) throws ArithmeticException {
	        int result = 10 / num; 
	        System.out.println("Result: " + result); 
	    }

	    public static void callerMethod(int num) {
	        try {
	            executeMethod(num);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException in caller method: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        int num = 0;
	        callerMethod(num);

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



