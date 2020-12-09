package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void test() {
        assertThat(LongestCommonPrefix.longestCommonPrefix("ab", "a"), is("a"));
    }

    @Test
    public void test2() {
        assertThat(LongestCommonPrefix.longestCommonPrefix("flower", "flow", "fling"), is("fl"));
    }

    @Test
    public void test3() {
        assertThat(LongestCommonPrefix.longestCommonPrefix("dog", "racecar", "car"), is(""));
    }

    @Test
    public void test4() {
        assertThat(LongestCommonPrefix.longestCommonPrefix("", ""), is(""));
    }

    @Test
    public void test5() {
        assertThat(LongestCommonPrefix.longestCommonPrefix("flower", "flower", "flower", "flower"), is("flower"));
    }
}