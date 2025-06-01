package assignments;


public class Assign45 {
    static int count;
    static String message;

    public Assign45(int c, String msg) {
        Assign45.count = c;
        Assign45.message = msg;
    }

    public static void show() {
        System.out.println("Static Count: " + count);
        System.out.println("Static Message: " + message);
    }

    public static void main(String[] args) {
        Assign45 obj = new Assign45(10, "Hello Static!");
        Assign45.show();
    }
}

