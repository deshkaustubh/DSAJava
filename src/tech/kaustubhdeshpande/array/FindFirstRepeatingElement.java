package tech.kaustubhdeshpande.array;

import java.util.*;

public class FindFirstRepeatingElement {
    public int firstRepeated(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first element with freq > 1
        for (int i = 0; i < arr.length; i++) {
            if (freq.get(arr[i]) > 1) {
                return i + 1; // 1-based index
            }
        }

        return -1; // no repetition
    }
}
