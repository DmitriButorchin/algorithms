package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var node = queue.remove();
            if (node != null) {
                var left = node.left;
                node.left = node.right;
                node.right = left;
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return root;
    }
}
