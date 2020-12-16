package ru.baib;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
 * Memory Usage: 38.3 MB, less than 98.51% of Java online submissions for Search Insert Position.
 */

public class SearchInsertPosition {
    public static int searchIns(int[] nums, int target) {
        if (target == 0 || nums.length == 0) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                res = i;
                break;
            } else if (nums[i + 1] == target || (target > nums[i] && target < nums[i + 1])) {
                res = i + 1;
            }
        }
        return res;
    }

    public static int searchInsert (int[] nums, int target) {
        int i = 0;

        while (i < nums.length && nums[i] < target) i++;

        return i;
    }

}
