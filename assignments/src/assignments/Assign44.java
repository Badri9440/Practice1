package assignments;

interface A {
    default void show() {
        System.out.println("Interface A's show method");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B's show method");
    }
}

public class Assign44 implements A, B {
    
    @Override
    public void show() {
        A.super.show(); 
        B.super.show();
        System.out.println("Assign44's override of show()");
    }

    public static void main(String[] args) {
        Assign44 obj = new Assign44();
        obj.show();
    }
}
