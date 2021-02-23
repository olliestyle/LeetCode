package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOf1BitsTest {
    @Test
    public void test() {
        assertEquals(2, NumberOf1Bits.hammingWeight(5));
        assertEquals(28, NumberOf1Bits.hammingWeight(268435455));
    }
}