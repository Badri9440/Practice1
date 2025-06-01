package assignments;

public class Assign47 {
    public static void main(String[] args) {
        String full = "CoreNuts Technologies Pvt ltd.";
        String result = full.substring(0, full.indexOf("Pvt")).trim();
        System.out.println("Substring: " + result);
    }
}
