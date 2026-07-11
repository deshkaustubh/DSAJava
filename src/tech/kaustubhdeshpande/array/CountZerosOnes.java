package tech.kaustubhdeshpande.array;

public class CountZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int[] result = getZeroOneCount(arr);
        System.out.printf("The count of Zeroes is %d\nThe count of Ones is: %d", result[0], result[1]);
    }

    static int[] getZeroOneCount(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                zeroCount++;
            }
        }
        return new int[]{zeroCount, oneCount};
    }
}
