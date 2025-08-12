public class binary_search {
    public static void main(String[] args) {
        // Array must be sorted for binary search to work
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70, 80};
        int target = 10; // Element to search for
        
        // Variables for binary search
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int position = -1; // Will remain -1 if element is not found
        
        // Binary search algorithm
        while (left <= right) {
            // Calculate middle index
            mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                position = mid;
                break;
            }
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
                }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Print result
        if (position == -1) {
            System.out.println("Element " + target + " not found in the array");
        } else {
            System.out.println("Element " + target + " found at index " + position);
        }
    }
}
