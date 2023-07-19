package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary tree,
	determine if it is a valid binary search tree (BST).

	A valid BST is defined as follows:
	- The left subtree of a node contains only nodes
	with keys less than the node's key.
    - The right subtree of a node contains only nodes
	with keys greater than the node's key.
    - Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
        var stack = new Stack<TreeNode>();
        var current = root;
        TreeNode previous = null;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            var node = stack.pop();
            if (previous != null && previous.val >= node.val) {
                return false;
            }
            previous = node;
            current = node.right;
        }

        return true;
    }
}
