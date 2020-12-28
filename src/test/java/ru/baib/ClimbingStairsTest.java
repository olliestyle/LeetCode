package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ClimbingStairsTest {
    @Test
    public void test() {
        assertThat(ClimbingStairs.climb(1), is(1));
        assertThat(ClimbingStairs.climb(2), is(2));
        assertThat(ClimbingStairs.climb(3), is(3));
        assertThat(ClimbingStairs.climb(4), is(5));
        assertThat(ClimbingStairs.climb(5), is(8));
        assertThat(ClimbingStairs.climb(6), is(13));
        assertThat(ClimbingStairs.climb(7), is(21));
    }
}