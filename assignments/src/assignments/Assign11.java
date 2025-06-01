package assignments;
import java.util.*;

public class Assign11 {
	public static void main(String[] args) {
        
        Random random = new Random();
        
        
        int secondRandomValue = random.nextInt(100); 
        
        System.out.println("Second Random Value: " + secondRandomValue);
        
        
        for (int i = 1; i <= 25; i++) {
            int randomValue = random.nextInt(100); 
            System.out.print("Random Value " + i + ": " + randomValue + " - ");
            
           
            if (randomValue > secondRandomValue) {
                System.out.println("Greater than " + secondRandomValue);
            } else if (randomValue < secondRandomValue) {
                System.out.println("Less than " + secondRandomValue);
            } else {
                System.out.println("Equal to " + secondRandomValue);
            }
        }
    }

}
