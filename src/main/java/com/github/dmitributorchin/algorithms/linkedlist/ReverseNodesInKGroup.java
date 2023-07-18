package com.github.dmitributorchin.algorithms.linkedlist;

/**
	Given the head of a linked list,
	reverse the nodes of the list k at a time,
	and return the modified list.

	k is a positive integer and is less than or equal to the length
	of the linked list.
	If the number of nodes is not a multiple of k then left-out nodes,
	in the end, should remain as it is.

	You may not alter the values in the list's nodes,
	only nodes themselves may be changed.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        var result = new ListNode(0, head);
        var groupPrev = result;
		
		while(true) {
			ListNode kth = getKth(groupPrev, k);
			if (kth == null) {
				break;
			}

			ListNode prev = kth.next;
			ListNode current = groupPrev.next;
			while (current != kth.next) {
				var temp = current.next;
				current.next = prev;
				prev = current;
				current = temp;
			}
			
			var temp = groupPrev.next;
			groupPrev.next = kth;
			groupPrev = temp;
		};

        return result.next;
    }
	
	private ListNode getKth(ListNode current, int k) {
		while (current != null && k > 0) {
			current = current.next;
			k--;
		}
		
		return current;
	}
}
