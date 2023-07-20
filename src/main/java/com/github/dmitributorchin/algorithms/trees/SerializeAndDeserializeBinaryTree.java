package com.github.dmitributorchin.algorithms.trees;

/**
	Serialization is the process of converting a data structure or object
	into a sequence of bits so that it can be stored in a file
	or memory buffer, or transmitted across a network connection link
	to be reconstructed later in the same or another computer environment.

	Design an algorithm to serialize and deserialize a binary tree.
	There is no restriction on how your serialization/deserialization
	algorithm should work.
	You just need to ensure that a binary tree can be serialized
	to a string and this string can be deserialized to the original
	tree structure.

	Clarification: The input/output format is the same as how LeetCode
	serializes a binary tree.
	You do not necessarily need to follow this format,
	so please be creative and come up with different approaches yourself.
 */
public class SerializeAndDeserializeBinaryTree {
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        var result = new StringBuilder();
        var stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            var node = stack.pop();
            result.append(node == null ? "null" : node.val);
            if (node != null) {
                stack.add(node.right);
                stack.add(node.left);
            }
            if (!stack.isEmpty()) {
                result.append(',');
            }
        }

        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        var nodes = data.split(",");
        return deserialize(nodes, 0).node();
    }

    private Data deserialize(String[] nodes, int index) {
        if (index >= nodes.length || nodes[index].equals("null")) {
            return new Data(null, index + 1);
        }

        var node = new TreeNode(Integer.parseInt(nodes[index]));
        var left = deserialize(nodes, index + 1);
        node.left = left.node();
        var right = deserialize(nodes, left.index());
        node.right = right.node();

        return new Data(node, right.index());
    }

    record Data(TreeNode node, int index) {}
}
