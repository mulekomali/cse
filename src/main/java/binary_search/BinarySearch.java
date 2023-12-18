package binary_search;

public class BinarySearch {

	public static int binarySearch(int[] array, int target) {
		 int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            // Check if the target is present at the middle
	            if (array[mid] == target) {
	                return mid;
	            }

	            // If target is greater, ignore the left half
	            if (array[mid] < target) {
	                left = mid + 1;
	            }
	            // If target is smaller, ignore the right half
	            else {
	                right = mid - 1;
	            }
	        }

	        // If we reach here, then the element was not present
	        return -1;
	    }

}
