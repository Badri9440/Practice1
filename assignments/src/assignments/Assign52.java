package assignments;


public class Assign52 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("CoreNuts Pvt ltd.");
        sb.insert(8, " Technologies"); 

        System.out.println("After Insert: " + sb.toString());
    }
}
