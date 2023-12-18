package binary_search;
import java.util.Scanner;

public class Sortingclass {
	 public static void main(String[] args) {
	        // Get user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Sort the array (bubble sort)
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap the elements
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }

	        // Display the sorted array
	        System.out.print("Sorted array: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();

	        // Get the element for binary search
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        // Perform binary search
	        int result = BinarySearch.binarySearch(array, target);

	        // Display the result
	        if (result != -1) {
	            System.out.println("Element found at index " + result);
	        } else {
	            System.out.println("Element not found");
	        }

	        // Close the scanner
	        scanner.close();
	    }
}
