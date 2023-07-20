package com.github.dmitributorchin.algorithms.trees;

/**
	Given two integer arrays preorder and inorder
	where preorder is the preorder traversal of a binary tree
	and inorder is the inorder traversal of the same tree,
	construct and return the binary tree.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(
            preorder, 0,
            inorder, 0, inorder.length - 1
        );
    }

    private TreeNode buildTree(
        int[] preorder, int preorderLeft,
        int[] inorder, int inorderLeft, int inorderRight
    ) {
        var node = new TreeNode(preorder[preorderLeft]);
        preorderLeft++;

        int inorderIndex = inorderLeft;
        if (inorder[inorderIndex] != node.val) {
            for (; inorder[inorderIndex] != node.val; inorderIndex++) {}
            node.left = buildTree(
                preorder, preorderLeft,
                inorder, inorderLeft, inorderIndex - 1
            );
        }

        if (inorderIndex + 1 <= inorderRight) {
            node.right = buildTree(
                preorder, preorderLeft + (inorderIndex - inorderLeft),
                inorder, inorderIndex + 1, inorderRight
            );
        }

        return node;
    }
}
