package assignments;


	interface Animal {
	    void eat();  
	    void sleep(); 
	}

	abstract class Dog implements Animal {
	}

	class Bulldog extends Dog {

	    @Override
	    public void eat() {
	        System.out.println("Bulldog is eating.");
	    }

	    @Override
	    public void sleep() {
	        System.out.println("Bulldog is sleeping.");
	    }
	}

	public class Assign18 {
	    public static void main(String[] args) {
	        
	        Bulldog bulldog = new Bulldog();
	        
	        
	        bulldog.eat();    
	        bulldog.sleep();  
	    }
	}



