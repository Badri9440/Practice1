package assignments;


public class Assign54 {
    public static void main(String[] args) {
        String input = "programming";
        int length = input.length();

        System.out.println("Repeated characters:");
        
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            int count = 1;

            for (int j = i + 1; j < length; j++) {
                if (input.charAt(j) == ch) {
                    count++;
                    input = input.substring(0, j) + '*' + input.substring(j + 1);
                }
            }

            if (count > 1) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}
