package assignments;

public class Assign51 {
    public static void main(String[] args) {
        String input = "CoreNuts Technologies Pvt ltd.";
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        System.out.println("Reversed characters in each word: " + result.toString().trim());
    }
}
