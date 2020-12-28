package ru.baib;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
 * Memory Usage: 38.1 MB, less than 96.34% of Java online submissions for Remove Duplicates from Sorted List.
 */

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDupl(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode next = head.next;
        while (next != null) {
            if (current.val != next.val) {
                current.next = next;
                current = next;
            }
            next = next.next;
        }
        current.next = null;
        return head;
    }
}

