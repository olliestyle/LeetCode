package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        ListNode expected = new ListNode(1);
        assertEquals(RemoveDuplicatesFromSortedList.deleteDupl(head), expected);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(RemoveDuplicatesFromSortedList.deleteDupl(head), expected);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3)))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(RemoveDuplicatesFromSortedList.deleteDupl(head), expected);
    }

    @Test
    public void test4() {
        ListNode head = null;
        ListNode expected = null;
        assertEquals(RemoveDuplicatesFromSortedList.deleteDupl(head), expected);
    }
}