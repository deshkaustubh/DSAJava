package tech.kaustubhdeshpande.array;

import java.util.HashMap;

public class HighestAndLowestFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5};
        System.out.printf("Highest Freq: %d\nLowest Freq: %d", (getHighestAndLowestFreq(arr)[0]), (getHighestAndLowestFreq(arr)[1]));
    }

    static int[] getHighestAndLowestFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // insert data
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // For Highest frequency
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);

            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        // For Lowest frequency
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);

            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }

        return new int[]{highestNum, lowestNum};
    }
}

