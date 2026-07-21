package tech.kaustubhdeshpande.array;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachColumnIn2DArray {
    public static void main(String[] args) {

        // A 3x4 test matrix (3 rows, 4 columns)
        int[][] matrix = {
                {3, 8, 1, 6},
                {5, 2, 7, 4},
                {9, 0, 4, 3}
        };

        int totalRows = matrix.length;
        int totalColumn = matrix[0].length;
        List<Integer> result = new ArrayList<>();


        for(int col = 0; col < totalColumn; col++){
            int sum = 0;
            for (int row = 0; row < totalRows; row++){
                int value = matrix[row][col];
                sum += value;
            }

            result.add(sum);
        }


        System.out.println(result);
    }
}
