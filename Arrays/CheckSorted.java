package Arrays;

public class CheckSorted {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9,1, 2, 3, 4};
        boolean sorted = isSorted(arr);
        boolean rotated = isRotatedSorted(arr);
        if (sorted) {
            System.out.println("The array is sorted but not rotated.");
        } else if (rotated) {
            System.out.println("The array is rotated and sorted.");
        } else {
            System.out.println("The array is neither sorted nor rotated.");
        }
    }

    // Checking if the given array is sorted.
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Checking if the given array is rotated and sorted.
    public static boolean isRotatedSorted(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }

        // If there's more than one rotation point, it's not a rotated sorted array.
        if (count > 1) {
            return false;
        }

        // Additionally, check the edge case where the last element should not be greater than the first element.
        if (count == 1 && arr[n - 1] > arr[0]) {
            return false;
        }

        return count == 1;
    }
}
