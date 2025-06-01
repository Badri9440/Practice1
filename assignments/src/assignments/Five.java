package assignments;

public class Five {
	public static void main(String[] args) {
        int size = 9;

        
        System.out.print("* |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println();

        
        System.out.println("-------------------------------");

        
        for (int i = 1; i <= size; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
	

}
