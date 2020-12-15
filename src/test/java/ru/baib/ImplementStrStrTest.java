package ru.baib;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ImplementStrStrTest extends TestCase {
    @Test
    public void test() {
        assertThat(ImplementStrStr.strStr("hello", "ll"), is(2));
        assertThat(ImplementStrStr.strStr("aaaaa", "bba"), is(-1));
        assertThat(ImplementStrStr.strStr("", ""), is(0));
        assertThat(ImplementStrStr.strStr("a", "a"), is(0));
        assertThat(ImplementStrStr.strStr("a", ""), is(0));
        assertThat(ImplementStrStr.strStr("aaaa", "bbbb"), is(-1));
        assertThat(ImplementStrStr.strStr("abc", "c"), is(2));
    }
}