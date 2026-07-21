package tech.kaustubhdeshpande.array;

import java.util.ArrayList;
import java.util.List;

public class WavePrintMatrix {
    public static void main(String[] args) {
        // Allocates memory and populates data concurrently
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int totalRows = matrix.length;
        int totalCols = matrix[0].length;


        List<Integer> result = new ArrayList<>();

        for (int col = 0; col < totalCols; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < totalRows; row++) {
                    result.add(matrix[row][col]);
                }
            } else {
                for (int row = totalRows - 1; row >= 0; row++) {
                    result.add(matrix[row][col]);
                }
            }
        }

        System.out.println(result);
    }
}
