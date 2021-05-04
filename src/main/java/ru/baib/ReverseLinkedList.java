package ru.baib;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode before = null;
        ListNode current = head;
        ListNode next = current.next;
        while (next != null) {
            current.next = before;
            before = current;
            current = next;
            next = next.next;
        }
        current.next = before;
        return current;
    }
}
