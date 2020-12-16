package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SearchInsertPositionTest {
    @Test
    public void test() {
        assertThat(SearchInsertPosition.searchIns(new int[]{1, 3, 5, 6}, 5), is(2));
        assertThat(SearchInsertPosition.searchIns(new int[]{1, 3, 5, 6}, 2), is(1));
        assertThat(SearchInsertPosition.searchIns(new int[]{1, 3, 5, 6}, 7), is(4));
        assertThat(SearchInsertPosition.searchIns(new int[]{1, 3, 5, 6}, 0), is(0));
        assertThat(SearchInsertPosition.searchIns(new int[]{1}, 0), is(0));
        assertThat(SearchInsertPosition.searchIns(new int[]{}, 7), is(0));
        assertThat(SearchInsertPosition.searchIns(new int[]{1, 3}, 3), is(1));
    }

    @Test
    public void test2() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5), is(2));
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2), is(1));
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7), is(4));
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0), is(0));
        assertThat(SearchInsertPosition.searchInsert(new int[]{1}, 0), is(0));
        assertThat(SearchInsertPosition.searchInsert(new int[]{}, 7), is(0));
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3}, 3), is(1));
    }

}