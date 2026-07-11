package tech.kaustubhdeshpande.array;

public class SumOfPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 2 - 3, 4, 5, 6, -7, -8, -9};
        int[] result = getPositiveSum(arr);
        System.out.printf("Sum of Positives of array is: %d and\nsum of negatives of array is %d", result[0], result[1]);
    }

    static int[] getPositiveSum(int[] arr) {

        int positiveSum = 0;
        int negativeSum = 0;

        for (int i : arr) {
            if (i >= 0) {
                positiveSum += i;
            } else {
                negativeSum += i;
            }
        }
        return new int[]{positiveSum, negativeSum};
    }
}
