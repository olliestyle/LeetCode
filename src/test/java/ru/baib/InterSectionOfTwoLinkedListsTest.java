package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterSectionOfTwoLinkedListsTest {
    @Test
    public void test() {
        ListNode A = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
        ListNode B = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
        assertEquals(8, InterSectionOfTwoLinkedLists.getIntersection(A, B));
    }

}