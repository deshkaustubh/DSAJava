package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class ShiftBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        System.out.println("Old Array: " + Arrays.toString(arr));
        System.out.println("Old Array: " + Arrays.toString(shiftByOne(arr)));
    }

    static int[] shiftByOne(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        return arr;
    }
}
