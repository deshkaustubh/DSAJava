package tech.kaustubhdeshpande.array;

public class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {
        // initialize maxVal and sum
        int maximumValue = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++ ){
            // update Sum
            sum = sum + nums[i];

            // check the max value of sum
            maximumValue = Math.max(maximumValue, sum);

            // if sum is negative mark it as 0 before going to the next index
            if (sum < 0){
                sum = 0;
            }
        }

        return maximumValue;
    }
}
