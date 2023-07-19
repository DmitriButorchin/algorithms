package com.github.dmitributorchin.algorithms.trees;

/**
	Given the root of a binary tree,
	imagine yourself standing on the right side of it,
	return the values of the nodes you can see ordered from top to bottom.
 */
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        var result = new ArrayList<Integer>();

        var queue = new LinkedList<TreeNode>();
        queue.add(root);
        var level = 0;
        while (!queue.isEmpty()) {
            var size = queue.size();
            level++;
            for (var i = 0; i < size; i++) {
                var node = queue.remove();
                if (node != null) {
                    if (result.size() < level) {
                        result.add(node.val);
                    }
                    queue.add(node.right);
                    queue.add(node.left);
                }
            }
        }

        return result;
    }
}
