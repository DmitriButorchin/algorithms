package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * 2
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        var list = new ListNode();

        var current = list;
        var remainder = 0;
        while (first != null || second != null || remainder != 0) {
            var sum = remainder
                    + (first == null ? 0 : first.val)
                    + (second == null ? 0 : second.val);
            remainder = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        return list.next;
    }
}
