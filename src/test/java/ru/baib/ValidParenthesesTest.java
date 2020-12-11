package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void test1() {
        assertTrue(ValidParentheses.isValid("()(){}{}{}[][]"));
        assertTrue(ValidParentheses.isValid("({{}}[{}])"));
        assertTrue(ValidParentheses.isValid("((({{{}}}[][])))"));
        assertFalse(ValidParentheses.isValid("(]"));
        assertFalse(ValidParentheses.isValid("]"));
    }
}