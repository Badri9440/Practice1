package assignments;


public class Assign56 {
    public static void main(String[] args) {
        int num = 100;
        double price = 49.99;
        boolean flag = true;
        char ch = 'A';

        String s1 = String.valueOf(num);
        String s2 = Double.toString(price);
        String s3 = Boolean.toString(flag);
        String s4 = Character.toString(ch);

        System.out.println("Integer to String: " + s1);
        System.out.println("Double to String: " + s2);
        System.out.println("Boolean to String: " + s3);
        System.out.println("Char to String: " + s4);
    }
}
