package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var list = new ListNode();
        list.next = head;
        var left = list;
        var right = left;

        while (n > 0) {
            right = right.next;
            n--;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return list.next;
    }
}
