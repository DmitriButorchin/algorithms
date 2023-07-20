package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary search tree, and an integer k,
	return the kth smallest value (1-indexed) of all the values
	of the nodes in the tree.
 */
public class KthSmallestElementInBST {
	public int kthSmallest(TreeNode root, int k) {
        var stack = new Stack<TreeNode>();
        var current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            var node = stack.pop();
            k--;
            if (k == 0) {
                return node.val;
            }
            current = node.right;
        }

        throw new IllegalArgumentException();
    }
}
