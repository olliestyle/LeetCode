package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    @Test
    public void test1() {
        assertTrue(HappyNumber.isHappy(19));
        assertTrue(HappyNumber.isHappy(28));
        assertFalse(HappyNumber.isHappy(2));
    }
}