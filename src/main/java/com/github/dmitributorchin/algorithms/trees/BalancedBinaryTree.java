package com.github.dmitributorchin.algorithms.trees;

/**
	Given a binary tree, determine if it is height-balanced
.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return balanced(root).balanced();
    }

    private Data balanced(TreeNode node) {
        if (node == null) {
            return new Data(0, true);
        }

        var left = balanced(node.left);
        var right = balanced(node.right);

        return new Data(
            Math.max(left.height(), right.height()) + 1,
            Math.abs(left.height() - right.height()) <= 1
                && left.balanced()
                && right.balanced()
        );
    }
}

record Data(int height, boolean balanced) {}
