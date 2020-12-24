package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SqrtXTest {
    @Test
    public void test() {
        assertThat(SqrtX.sqrt(4), is(2));
        assertThat(SqrtX.sqrt(16), is(4));
        assertThat(SqrtX.sqrt(122), is(11));
        assertThat(SqrtX.sqrt(4), is(2));
        assertThat(SqrtX.sqrt(0), is(0));
    }
}