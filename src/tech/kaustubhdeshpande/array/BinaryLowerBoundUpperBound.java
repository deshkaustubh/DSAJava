package tech.kaustubhdeshpande.array;

public class BinaryLowerBoundUpperBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 30, 40, 50};
        int target = 35;

        System.out.println("The index of lower bound is: " + upperBound(arr, target));
        System.out.println("The index of lower bound is: " + lowerBound(arr, target));
    }

    static int lowerBound(int[] arr, int target) {
        int lb = -1; // if calculating total no of occurrences initialize this with size of the array
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // greater than the target move to left
            if (arr[mid] >= target) {
                // store the lb
                lb = mid;
                // move left
                end = mid - 1;
            } else {
                // lower than the target move to the left
                start = mid + 1;
            }
        }
        return lb;
    }

    static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int up = -1; // if calculating total no of occurrences initialize this with total no of occurrences.

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                // move right
                start = mid + 1;
            } else {
                // save
                up = mid;
                // move left
                end = mid - 1;
            }
        }
        return up;
    }
}
