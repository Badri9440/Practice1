package assignments;


	public class Assign33 {

	    public static void executeMethod(int num) throws ArithmeticException {
	        int result = 10 / num;  
	        System.out.println("Result: " + result);  
	    }

	    public static void main(String[] args) {
	        int num = 0;

	        try {
	            executeMethod(num);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException in caller class: " + e.getMessage());
	        }

	        System.out.println("Program execution continues after exception handling.");
	    }
	}



