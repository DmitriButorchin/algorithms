package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * You are given the head of a singly linked-list. The list can be represented as:
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * <p>
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        var second = slow.next;
        slow.next = null;
        ListNode previous = null;
        while (second != null) {
            var temp = second.next;
            second.next = previous;
            previous = second;
            second = temp;
        }

        var first = head;
        second = previous;
        while (second != null) {
            var next = first.next;
            first.next = second;
            second = second.next;
            first.next.next = next;
            first = first.next.next;
        }
    }
}
