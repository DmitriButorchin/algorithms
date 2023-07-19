package com.github.dmitributorchin.algorithms.trees;

/**
	Given a binary tree root,
	a node X in the tree is named good if in the path from root to X
	there are no nodes with a value greater than X.

	Return the number of good nodes in the binary tree.
 */
public class CountGoodNodesInBinaryTree {
	public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    private int goodNodes(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }

        max = Math.max(max, node.val);

        return goodNodes(node.left, max)
            + goodNodes(node.right, max)
            + (node.val >= max ? 1 : 0);
    }
}
