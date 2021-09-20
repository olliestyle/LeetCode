package ru.baib;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountingBitsTest {
    @Test
    public void countingBitTest() {
        assertThat(CountingBits.countBits(2), is(new int[]{0, 1, 1}));
        assertThat(CountingBits.mySol(5), is(new int[]{0, 1, 1, 2, 1, 2}));
    }
}