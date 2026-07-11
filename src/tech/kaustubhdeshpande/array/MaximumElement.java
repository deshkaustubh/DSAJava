package tech.kaustubhdeshpande.array;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,};

        System.out.printf("Max element of array is %d", findMaxElement(arr));
    }

    static int findMaxElement(int[] arr) {
        int result = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
