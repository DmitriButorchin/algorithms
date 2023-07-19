package com.github.dmitributorchin.algorithms.trees;

/**
	Given the roots of two binary trees root and subRoot,
	return true if there is a subtree of root
	with the same structure and node values of subRoot and false otherwise.

	A subtree of a binary tree tree is a tree that consists
	of a node in tree and all of this node's descendants.
	The tree tree could also be considered as a subtree of itself.
 */
public class SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        
        return isSame(root, subRoot)
            || isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null || first.val != second.val) {
            return false;
        }

        return isSame(first.left, second.left) && isSame(first.right, second.right);
    }
}
