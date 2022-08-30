package ru.baib;

import java.util.Arrays;

/**
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation:
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 * sum = 28
 */

public class PivotIndex {

    public static void main(String[] args) {
        new PivotIndex().pivotIndex(new int[]{1,7,3,6,5,6});
    }

    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int accumLeft = 0;
        int accumRight = sum;
        for (int i = 0; i < nums.length; i++) {
            if (accumRight - nums[i] == accumLeft) {
                return i;
            } else {
                accumLeft = accumLeft + nums[i];
                accumRight = accumRight - nums[i];
            }
        }
        return -1;
    }

}
