package ru.baib;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

public class ReverseLinkedListTest {
    @Test
    public void test() {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList rev = new ReverseLinkedList();
        assertThat(rev.reverseList(head), is(expected));
    }
    @Test
    public void test2() {
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode expected = new ListNode(1, new ListNode(2));
        ReverseLinkedList rev = new ReverseLinkedList();
        assertThat(rev.reverseList(head), is(expected));
    }
    @Test
    public void test3() {
        ListNode head = null;
        ListNode expected = null;
        ReverseLinkedList rev = new ReverseLinkedList();
        assertThat(rev.reverseList(head), is(expected));
    }
}