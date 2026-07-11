package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class PrintAlternateExtremeElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Old Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(alternateExtremes(arr)));
    }

    static int[] alternateExtremes(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[left++];
            } else {
                result[i] = arr[right--];
            }
        }
        return result;
    }
}
