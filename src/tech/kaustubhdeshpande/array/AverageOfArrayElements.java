package tech.kaustubhdeshpande.array;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7, 4, 0};
        System.out.printf("The average of array is: %f", getAverage(arr));
    }

    public static double getAverage(int[] arr) {
        double sum = 0;

        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;
        return size / sum;
    }
}
