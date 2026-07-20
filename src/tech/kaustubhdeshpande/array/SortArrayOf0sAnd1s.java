package tech.kaustubhdeshpande.array;

import java.util.Arrays;

public class SortArrayOf0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        System.out.println("The Sorted Array: " + Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }
        }

        return arr;
    }
}
