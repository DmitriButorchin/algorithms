package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary tree, return its maximum depth.

	A binary tree's maximum depth is the number of nodes
	along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        var depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            depth++;
            var size = queue.size();
            for (var i = 0; i < size; i++) {
                var node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return depth;
    }
}
