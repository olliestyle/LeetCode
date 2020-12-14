package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void testRemoveEl() {
        int[] nums = {1, 1, 2, 3, 1, 1, 4, 5, 1, 1};
        assertThat(RemoveElement.removeElement(nums, 1), is(4));
        assertThat(nums[0], is(2));
        assertThat(nums[1], is(3));
        assertThat(nums[2], is(4));
        assertThat(nums[3], is(5));
    }

}