package ru.baib;

import java.util.Objects;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode result = new ListNode();
        ListNode current = result;
        result.next = new ListNode();
        ListNode next = result.next;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null && l1.val <= l2.val) {
                current.val = l1.val;
                l1 = l1.next;
            } else if (l1 != null && l2 != null) {
                current.val = l2.val;
                l2 = l2.next;
            } else if (l1 == null) {
                current.val = l2.val;
                l2 = l2.next;
            } else {
                current.val = l1.val;
                l1 = l1.next;
            }
            if (l1 != null || l2 != null) {
                next.next = new ListNode();
                current = next;
            } else {
                current.next = null;
            }
            next = next.next;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
