package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class PrintArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7};
        int[] arr2 = {9,7,5,5,2,4,3,2,};
        System.out.printf("The new array with the intersection elements of previous two arrays is: %s", Arrays.toString(arrayIntersectionElements(arr1, arr2)));
    }

    static int[] arrayIntersectionElements(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int j = 0;

        for (int k : arr1) {
            for (int value : arr2) {
                if (k == value) {
                    temp[j++] = k;
                    break; // avoid duplicates from arr2
                }
            }
        }

        // Trim result to actual size j
        return Arrays.copyOf(temp, j);
    }
}
