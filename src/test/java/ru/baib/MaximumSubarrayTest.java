package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    @Test
    public void test() {
        assertThat(MaximumSubarray.maxSubArr(new int[]{1, 2, 3, -3, 4}), is(7));
        assertThat(MaximumSubarray.maxSubArr(new int[]{1, 2, 3, -3, -5, 8}), is(8));
        assertThat(MaximumSubarray.maxSubArr(new int[]{1, 2, 3, -3, -5, 5}), is(6));
        assertThat(MaximumSubarray.maxSubArr(new int[]{0}), is(0));
        assertThat(MaximumSubarray.maxSubArr(new int[]{1}), is(1));
        assertThat(MaximumSubarray.maxSubArr(new int[]{-3, -2, -1, -4}), is(-1));
        assertThat(MaximumSubarray.maxSubArr(new int[]{1, 2, 3, -3, 4, -5, 9, 2, -1}), is(13));
        assertThat(MaximumSubarray.maxSubArr(new int[]{1, 2, 3, -3, 4, -8, 9, 2, -1}), is(11));
    }
}