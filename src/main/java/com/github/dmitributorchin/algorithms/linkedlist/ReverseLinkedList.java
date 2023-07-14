package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        var current = head;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
