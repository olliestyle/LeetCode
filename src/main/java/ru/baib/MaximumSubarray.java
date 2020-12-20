package ru.baib;

/**
 * Kadane’s algorithm
 * while curmax > 0, compare, else start from that point.
 */

public class MaximumSubarray {
    public static int maxSubArr(int[] nums) {
        int max = nums[0];
        int curMax = 0;
        for (int i = 0; i < nums.length; i++) {
            curMax = curMax + nums[i];
            if (curMax > max) {
                max = curMax;
            }
            if (curMax < 0) {
                curMax = 0;
            }
        }
        return max;
    }
}
