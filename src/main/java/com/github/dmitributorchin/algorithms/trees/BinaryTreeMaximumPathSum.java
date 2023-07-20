package com.github.dmitributorchin.algorithms.trees;

/**
	A path in a binary tree is a sequence of nodes
	where each pair of adjacent nodes in the sequence
	has an edge connecting them.
	A node can only appear in the sequence at most once.
	Note that the path does not need to pass through the root.

	The path sum of a path is the sum of the node's values in the path.

	Given the root of a binary tree,
	return the maximum path sum of any non-empty path.
 */
public class BinaryTreeMaximumPathSum.java {
	public int maxPathSum(TreeNode root) {
        return maxSum(root).max();
    }

    private Data maxSum(TreeNode node) {
        if (node == null) {
            return new Data(Integer.MIN_VALUE, 0);
        }

        var left = maxSum(node.left);
        var right = maxSum(node.right);
        var max = Math.max(left.max(), right.max());
        var currentMax = Math.max(0, left.sum()) + node.val + Math.max(0, right.sum());
        var sum = Math.max(left.sum(), right.sum());

        return new Data(
            Math.max(max, currentMax),
            Math.max(0, sum) + node.val
        );
    }
}

record Data(int max, int sum) {}
