package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {

    @Test
    public void test() {
        assertEquals(5, MaxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, MaxProfit.maxProfit(new int[]{7, 6, 5, 3, 1}));
    }
}