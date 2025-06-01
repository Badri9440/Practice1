package assignments;

public class Assign10 {
	public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Testing case for value: " + i);
            
            
            switch (i) {
                case 1:
                    System.out.println("Case 1: This is case one.");
                    break;
                case 2:
                    System.out.println("Case 2: This is case two.");
                    break;
                case 3:
                    System.out.println("Case 3: This is case three.");
                    break;
                case 4:
                    System.out.println("Case 4: This is case four.");
                    break;
                default:
                    System.out.println("Default case: No match found.");
            }
            
            System.out.println("---------------");
        }

        System.out.println("Now, removing the break statements...");

        // Looping through case values again without breaks
        for (int i = 1; i <= 4; i++) {
            System.out.println("Testing case for value: " + i);
            
            
            switch (i) {
                case 1:
                    System.out.println("Case 1: This is case one.");
                case 2:
                    System.out.println("Case 2: This is case two.");
                case 3:
                    System.out.println("Case 3: This is case three.");
                case 4:
                    System.out.println("Case 4: This is case four.");
                default:
                    System.out.println("Default case: No match found.");
            }
            
            System.out.println("---------------");
        }
    }

}
