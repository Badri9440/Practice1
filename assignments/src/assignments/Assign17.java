package assignments;


	interface Animal {

	    
	    public void eat();

	    
	    default void sleep() {
	        System.out.println("Animal sleeps.");
	    }

	    
	    static void breathe() {
	        System.out.println("Animal is breathing.");
	    }

	    
	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	   
	    
	}

	
	class Dog implements Animal {

	    @Override
	    public void eat() {
	        System.out.println("Dog is eating.");
	    }

	    @Override
	    public void sleep() {
	        System.out.println("Dog is sleeping.");
	    }

	  
	}

	public class Assign17 {
	    public static void main(String[] args) {
	      
	        Dog dog = new Dog();
	        
	       
	        dog.eat();     
	        dog.sleep();    
	        
	        
	        Animal.breathe(); 
	        
	       
	        // dog.privateMethod(); 
	    }
	}



