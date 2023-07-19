package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary tree,
	return the level order traversal of its nodes' values.
	(i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        var result = new ArrayList<List<Integer>>();

        var queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var size = queue.size();
            var level = new ArrayList<Integer>();
            for (var i = 0; i < size; i++) {
                var node = queue.remove();
                if (node != null) {
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }

            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}
