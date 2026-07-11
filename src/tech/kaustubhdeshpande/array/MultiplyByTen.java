package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class MultiplyByTen {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Your New Array is" + Arrays.toString(multiplyBy10(arr)));
    }

    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i] * 10;
        }

        return newArr;
    }
}
