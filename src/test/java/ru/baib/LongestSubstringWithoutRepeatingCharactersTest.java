package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongest("abcabcbb"));
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongest("bbbbb"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongest("pwwkew"));
    }
}