package assignments;

public class Two {
	public static void main(String[] args) {
        
        int col = 5;

        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("# ");
            }
            System.out.println(); // Move to next row
        }
    }

}
