package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {
    @Test
    public void test() {
        int[] nums = {3, 2, 3};
        assertEquals( 3, MajorityElement.majority(nums));
    }

    @Test
    public void test1() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals( 2, MajorityElement.majority(nums));
    }
}