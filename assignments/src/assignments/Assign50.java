package assignments;

public class Assign50 {
    public static void main(String[] args) {
        String input = "CoreNuts Technologies Pvt ltd.";

        String reversed1 = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversed1);

        String reversed2 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed2 += input.charAt(i);
        }
        System.out.println("Reversed (loop): " + reversed2);
    }
}

