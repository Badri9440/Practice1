package assignments;

public class Assign8 {
	public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

      
        int[] bubbleSortedArray = numbers.clone(); // Clone to keep original for other sorts
        bubbleSort(bubbleSortedArray);
        System.out.print("Bubble Sort (Ascending): ");
        printArray(bubbleSortedArray);

        
        int[] selectionSortedArray = numbers.clone(); // Clone to keep original for other sorts
        selectionSort(selectionSortedArray);
        System.out.print("Selection Sort (Ascending): ");
        printArray(selectionSortedArray);

        
        int[] insertionSortedArray = numbers.clone(); // Clone to keep original for other sorts
        insertionSort(insertionSortedArray);
        System.out.print("Insertion Sort (Ascending): ");
        printArray(insertionSortedArray);
    }

    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

   
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

   
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
