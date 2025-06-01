package assignments;


	

	
	public abstract  class Calculator {
	    
	    
	    public static final double PI = 3.14159;

	   
	    public abstract double calculate(double a, double b);

	    
	    public final void showConstant() {
	        System.out.println("Constant PI = " + PI);
	    }

	    
	    public static void info() {
	        System.out.println("Calculator Utility Class");
	    }
	}

	
	class MyCalculator extends Calculator {

	    @Override
	    public double calculate(double a, double b) {
	        return a + b;  
	    }
	}

	
	class Assign15 {
	    public static void main(String[] args) {
	        MyCalculator calc = new MyCalculator();

	        System.out.println("Calculation Result: " + calc.calculate(15.5, 4.5));
	        calc.showConstant();        
	        Calculator.info();          
	    }
	}



