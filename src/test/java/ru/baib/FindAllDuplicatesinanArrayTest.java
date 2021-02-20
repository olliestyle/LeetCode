package ru.baib;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindAllDuplicatesinanArrayTest {

    @Test
    public void test() {
        int[] test = {1, 2, 3, 4, 4};
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        assertEquals(expected, FindAllDuplicatesinanArray.findDuplicatesLeet(test));
    }

    @Test
    public void test2() {
        int[] test = {};
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, FindAllDuplicatesinanArray.findDuplicates(test));
    }

    @Test
    public void test3() {
        int[] test = {1, 2, 3, 4};
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, FindAllDuplicatesinanArray.findDuplicates(test));
    }
}