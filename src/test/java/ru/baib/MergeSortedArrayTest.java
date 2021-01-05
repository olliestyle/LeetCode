package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    @Test
    public void test() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 2, 3, 5, 6}));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6, 7, 8};
        MergeSortedArray.merge(nums1, 1, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 5, 6, 7, 8}));
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{1, 2, 7, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 2, 5, 6, 7}));
    }

    @Test
    public void test4() {
        int[] nums1 = new int[]{0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(nums1, 0, nums2, nums2.length);
        assertThat(nums1, is(new int[]{2, 5, 6}));
    }

    @Test
    public void test5() {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        MergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test6() {
        int[] nums1 = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 2};
        MergeSortedArray.merge(nums1, 6, nums2, nums2.length);
        assertThat(nums1, is(new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3}));
    }

    @Test
    public void test7() {
        int[] nums1 = new int[]{0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{-31, -2, -2};
        MergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        assertThat(nums1, is(new int[]{-31, -2, -2, 0, 0, 0}));
    }

    @Test
    public void test8() {
        int[] nums1 = new int[]{0, 0, 3, 0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{-1, 1, 1, 1, 2, 3};
        MergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        assertThat(nums1, is(new int[]{-1, 0, 0, 1, 1, 1, 2, 3, 3}));
    }

    @Test
    public void test9() {
        int[] nums1 = new int[]{1, 2, 7, 8, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(nums1, 4, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 2, 5, 6, 7, 8}));
    }

    @Test
    public void test10() {
        int[] nums1 = new int[]{1, 2, 7, 8, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6, 6};
        MergeSortedArray.merge(nums1, 4, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 2, 5, 6, 6, 7, 8}));
    }

    @Test
    public void test11() {
        int[] nums1 = new int[]{1, 2, 7, 8};
        int[] nums2 = new int[]{};
        MergeSortedArray.merge(nums1, 4, nums2, nums2.length);
        assertThat(nums1, is(new int[]{1, 2, 7, 8}));
    }
}