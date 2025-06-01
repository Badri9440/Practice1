package assignments;

public class Assign6 {
	public static void main(String[] args) {
        int n = 20;
        int first = 1, second = 1;
        int sum = first + second;

        System.out.println("The first "+n+" Fibonacci numbers are:");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            sum += next;
            first = second;
            second = next;
        }

        double average = (double) sum / n;
        System.out.println("\nThe average is " + average);
    }
}
