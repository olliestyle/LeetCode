package ru.baib;

public class InterSectionOfTwoLinkedLists {
    public static ListNode getIntersection(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode nodeB = headB;
            while (nodeB != null) {
                if (headA == nodeB) {
                    return headA;
                }
                nodeB = nodeB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
