package tech.kaustubhdeshpande.array;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 4};
        insertionSort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        // start from 1 because 0th we are considering sorted
        for (int i = 1; i < n; i++) {
            int pr = i - 1;
            int crValue = arr[i];

            // looping for shifting values
            while (pr >= 0 && crValue < arr[pr]) {
                arr[pr + 1] = arr[pr];
                pr--;
            }

            // filling the empty space
            arr[pr + 1] = crValue;
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        // outer loop from 0 till the second last element because last one does not require sorting
        // but running the loop till n as well won't create any exception just that a redundant round
        for (int i = 0; i < n - 1; i++) {
            // the initial min index is at ith position which will be updated in the inner loop
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
