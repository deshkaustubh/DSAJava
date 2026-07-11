package tech.kaustubhdeshpande.array;

import java.util.HashMap;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5};
        System.out.println(modeOfArray(arr));
    }

    static int modeOfArray(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }

        return maxFreqKey;
    }
}
