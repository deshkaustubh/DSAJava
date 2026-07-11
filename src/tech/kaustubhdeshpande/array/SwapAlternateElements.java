package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class SwapAlternateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Old Array is: " + Arrays.toString(arr));
        System.out.println("New Array is: " + Arrays.toString(swapElements(arr)));
    }

    static int[] swapElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}
