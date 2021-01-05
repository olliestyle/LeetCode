package ru.baib;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 38.7 MB, less than 98.37% of Java online submissions for Merge Sorted Array.
 */

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = nums1.length - 1;
            int j = n - 1;
            int k = m - 1;
            while (i >= 0) {
                if (j < 0) {
                    nums1[i] = nums1[k--];
                } else if (k < 0) {
                    nums1[i] = nums2[j--];
                } else {
                    if (nums2[j] >= nums1[k]) {
                        nums1[i] = nums2[j];
                        j--;
                    } else {
                        nums1[i] = nums1[k];
                        k--;
                    }
                }
                i--;
            }
        }
    }
