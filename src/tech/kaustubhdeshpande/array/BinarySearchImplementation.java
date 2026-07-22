package tech.kaustubhdeshpande.array;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        // find index of 9
        System.out.println("Index of target is: " + binaryImpl(arr, target));
    }

    public static int binaryImpl(int[] arr, int target) {

        int n = arr.length;

        int start = 0;
        int end = n - 1;

        // int mid = start + end / 2; -> this may cause integer overflow so avoid this
        int mid = start + ((end - start) / 2);

        while (start <= end) {

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                // move right
                start = mid + 1;
            } else {
                // go left
                end = mid - 1;
            }
            // update mid
            mid = (start + end) / 2;
        }
        return -1;
    }
}
