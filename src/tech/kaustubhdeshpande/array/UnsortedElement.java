package tech.kaustubhdeshpande.array;

public class UnsortedElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2};
        System.out.printf("First unsorted element is: %d", firstUnsortedElement(arr));
    }

    static int firstUnsortedElement(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            } else {
                return arr[i];
            }
        }
        return -1;
    }
}
