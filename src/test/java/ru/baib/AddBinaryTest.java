package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddBinaryTest {
    @Test
    public void test() {
        assertThat(AddBinary.addBinaryMine("1101", "11"), is("10000"));
        assertThat(AddBinary.addBinaryMine("1", "11"), is("100"));
        assertThat(AddBinary.addBinaryMine("1010", "1011"), is("10101"));
        assertThat(AddBinary.addBinaryMine("", ""), is(""));
        assertThat(AddBinary.addBinaryMine("", "0"), is("0"));
    }
    @Test
    public void test2() {
        assertThat(AddBinary.addBinaryInt("1101", "11"), is("10000"));
        assertThat(AddBinary.addBinaryInt("1", "11"), is("100"));
        assertThat(AddBinary.addBinaryInt("1010", "1011"), is("10101"));
        assertThat(AddBinary.addBinaryInt("", ""), is(""));
        assertThat(AddBinary.addBinaryInt("", "0"), is("0"));
    }
}