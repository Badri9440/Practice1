package assignments;

public class Assign7 {
	 public static void main(String[] args) {
	        
	        int[] numbers = {5, 2, 9, 1, 7};

	        
	        bubbleSortAscending(numbers);
	        System.out.print("Ascending order: ");
	        printArray(numbers);

	        
	        bubbleSortDescending(numbers);
	        System.out.print("Descending order: ");
	        printArray(numbers);
	    }

	    
	    public static void bubbleSortAscending(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (array[j] > array[j + 1]) {
	                    
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	   
	    public static void bubbleSortDescending(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (array[j] < array[j + 1]) {
	                    
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	   
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
