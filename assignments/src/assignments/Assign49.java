package assignments;

public class Assign49 {
    public static void main(String[] args) {
        String str1 = "CoreNuts";
        String str2 = new String("CoreNuts");

        System.out.println("Using == : " + (str1 == str2));          
        System.out.println("Using .equals() : " + str1.equals(str2)); 
    }
}

