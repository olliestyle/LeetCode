package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDups() {
        assertThat(RemoveDuplicatesFromSortedArray.removeDuplicatesMine(new int[]
                {1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 7, 8, 9, 9, 9, 15}), is(8));
        assertThat(RemoveDuplicatesFromSortedArray.removeDuplicatesMine(new int[]{}), is(0));
    }
}