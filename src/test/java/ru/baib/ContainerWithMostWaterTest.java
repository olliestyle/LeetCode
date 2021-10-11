package ru.baib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    @Test
    public void test() {
        assertThat(ContainerWithMostWater.maxArea(new int[]{1, 8 , 6, 2, 5, 4, 8, 3, 7}), is(49));
    }
}