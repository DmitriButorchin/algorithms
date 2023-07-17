package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeLists(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }

        var middle = left + (right - left) / 2;
        var first = mergeLists(lists, left, middle);
        var second = mergeLists(lists, middle + 1, right);
        return mergeNodes(first, second);
    }

    private ListNode mergeNodes(ListNode first, ListNode second) {
        var result = new ListNode();
        var current = result;
        while (first != null && second != null) {
            if (first.val < second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }

        if (first != null) {
            current.next = first;
        }
        if (second != null) {
            current.next = second;
        }

        return result.next;
    }
}
