package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    @Test
    public void test() {
        assertThat(LengthOfLastWord.lengthLong("Hello World"), is(5));
        assertThat(LengthOfLastWord.lengthLong("HelloWorld"), is(10));
        assertThat(LengthOfLastWord.lengthLong("       "), is(0));
        assertThat(LengthOfLastWord.lengthLong2("Hello World"), is(5));
        assertThat(LengthOfLastWord.lengthLong2("HelloWorld"), is(10));
        assertThat(LengthOfLastWord.lengthLong2("a  ab "), is(2));
        assertThat(LengthOfLastWord.lengthLong2("a   "), is(1));
        assertThat(LengthOfLastWord.lengthLong2("       "), is(0));
    }
}