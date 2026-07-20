package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8};
        System.out.printf("Old Array: %s\n", Arrays.toString(arr));
        System.out.printf("New Array: %s", Arrays.toString(reversedArray(arr)));
    }

//    static int[] reversedArray(int[] arr) {
//        for (int i = 0; i < arr.length/2 ; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//        return arr;
//    }


    // using 2 pointer technique
    static int[] reversedArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        return arr;
    }

}
