package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void test() {
        int[] arr = {1, 1, 3, 2, 2};
        assertEquals(SingleNumber.singleNumberSet(arr), 3);
    }

    @Test
    public void test2() {
        int[] arr = {1, 1, 3, 2, 2, 4, 5, 6, 5, 4, 6, 77, 89, 93, 101, 89, 93, 77, 101};
        assertEquals(SingleNumber.singleNumberSet(arr), 3);
    }
}