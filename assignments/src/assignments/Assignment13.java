package assignments;


	class Person {
	    private String privateName = "Private Name";
	    String defaultName = "Default Name";             
	    protected String protectedName = "Protected Name";
	    public String publicName = "Public Name";

	    private void privateMethod() {
	        System.out.println("Private Method");
	    }

	    void defaultMethod() {
	        System.out.println("Default Method");
	    }

	    protected void protectedMethod() {
	        System.out.println("Protected Method");
	    }

	    public void publicMethod() {
	        System.out.println("Public Method");
	    }

	    public void showPrivate() {
	        
	        System.out.println("Accessing Private Variable: " + privateName);
	        privateMethod();
	    }
	}

	
	class Student extends Person {
	    public void accessInheritedMembers() {
	         System.out.println(privateName);       
	         privateMethod();                       

	        System.out.println("Accessing Default Variable: " + defaultName); 
	        defaultMethod();                                                  

	        System.out.println("Accessing Protected Variable: " + protectedName); // ✅ Inherited
	        protectedMethod();                                                    // ✅ Inherited

	        System.out.println("Accessing Public Variable: " + publicName); // ✅ Always accessible
	        publicMethod();                                                 // ✅ Always accessible
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        Student student = new Student();

	        // Accessing members via object
	        // System.out.println(student.privateName);  
	        // student.privateMethod();                  

	        // System.out.println(student.defaultName); 
	        // student.defaultMethod();                  

	         System.out.println(student.protectedName); 
	         student.protectedMethod();                 

	        System.out.println("Accessing Public Variable: " + student.publicName); 
	        student.publicMethod();                                                 

	       
	        student.showPrivate();

	        
	        student.accessInheritedMembers();
	    }
	}


}
