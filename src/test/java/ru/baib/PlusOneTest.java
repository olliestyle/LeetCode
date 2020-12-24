package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlusOneTest {
    @Test
    public void test() {
        assertThat(PlusOne.plusOne(new int[]{1, 2, 3, 4}), is(new int[] {1, 2, 3, 5}));
        assertThat(PlusOne.plusOne(new int[]{1, 9, 3, 4}), is(new int[] {1, 9, 3, 5}));
        assertThat(PlusOne.plusOne(new int[]{9}), is(new int[] {1, 0}));
        assertThat(PlusOne.plusOne(new int[]{8, 9, 9}), is(new int[] {9, 0, 0}));
        assertThat(PlusOne.plusOne(new int[]{7, 6, 9}), is(new int[] {7, 7, 0}));
        assertThat(PlusOne.plusOne(new int[]{7, 6, 9, 9, 9}), is(new int[] {7, 7, 0, 0, 0}));
        assertThat(PlusOne.plusOne(new int[]{9, 9, 9}), is(new int[] {1, 0, 0, 0}));
//        assertThat(PlusOne.plusOne(new int[]{}), is(new int[] {}));
    }
}