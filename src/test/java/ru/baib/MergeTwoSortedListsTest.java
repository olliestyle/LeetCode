package ru.baib;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    @Test
    public void test1() {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(5))))));
        assertThat(MergeTwoSortedLists.mergeTwoLists(l1, l2), is(l3));
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(91, new ListNode(98, new ListNode(99))))));
        ListNode l2 = new ListNode(89, new ListNode(90, new ListNode(90)));
        ListNode l3 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(89, new ListNode(90, new ListNode(90, new ListNode(91, new ListNode(98, new ListNode(99)))))))));
        assertThat(MergeTwoSortedLists.mergeTwoLists(l1, l2), is(l3));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode l3 = new ListNode(1);
        assertThat(MergeTwoSortedLists.mergeTwoLists(l1, l2), is(l3));
    }

    @Test
    public void test4() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode(0, new ListNode(1));
        assertThat(MergeTwoSortedLists.mergeTwoLists(l1, l2), is(l3));
    }

    @Test
    public void test5() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode l3 = null;
        assertThat(MergeTwoSortedLists.mergeTwoLists(l1, l2), is(l3));
    }
}