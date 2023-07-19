package com.github.dmitributorchin.algorithms.trees;

/**
	Given a binary search tree (BST),
	find the lowest common ancestor (LCA) node of two given nodes in the BST.

	According to the definition of LCA on Wikipedia:
	“The lowest common ancestor is defined between two nodes p and q
	as the lowest node in T that has both p and q as descendants
	(where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorOfBinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        var min = Math.min(p.val, q.val);
        var max = Math.max(p.val, q.val);

        while (min > root.val || max < root.val) {
            if (max < root.val) {
                root = root.left;
            } else if (min > root.val) {
                root = root.right;
            }
        }

        return root;
    }
}
