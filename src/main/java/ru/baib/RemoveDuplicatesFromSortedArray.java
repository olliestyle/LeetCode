package ru.baib;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesMine(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[k] = nums[i + 1];
                k = k + 1;
            }
        }
        return k;
    }

    public static int removeDuplicatesLeet(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
