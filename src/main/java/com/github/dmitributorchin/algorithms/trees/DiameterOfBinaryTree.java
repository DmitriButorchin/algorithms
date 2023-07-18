package com.github.dmitributorchin.algorithms.linkedlist;

/**
	Given the root of a binary tree,
	return the length of the diameter of the tree.

	The diameter of a binary tree is the length of the longest path
	between any two nodes in a tree.
	This path may or may not pass through the root.

	The length of a path between two nodes is represented
	by the number of edges between them.
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        return calculate(root).diameter();
    }

    private Data calculate(TreeNode node) {
        if (node == null) {
            return new Data(0, 0);
        }

        var left = calculate(node.left);
        var right = calculate(node.right);
        var max = Math.max(left.diameter(), right.diameter());

        return new Data(
            Math.max(left.depth() + right.depth(), max),
            Math.max(left.depth(), right.depth()) + 1
        );
    }
}

record Data(int diameter, int depth) {}
