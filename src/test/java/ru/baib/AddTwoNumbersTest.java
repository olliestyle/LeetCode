package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(3, new ListNode(5, new ListNode(7)));
        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1 ,l2));
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1 ,l2));
    }

    @Test
    public void test0() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1 ,l2));
    }
}