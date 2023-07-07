package com.github.dmitributorchin.algorithms.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class GenerateParentheses {
    public List<String> generateParentheses(int n) {
        var result = new ArrayList<String>();
        var stack = new Stack<Data>();
        stack.push(new Data(new StringBuilder("("), 1, 0));
        while (!stack.isEmpty()) {
            var data = stack.pop();
            if (data.open != n || data.closed != n) {
                if (data.open < n) {
                    var builder = new StringBuilder(data.builder).append('(');
                    stack.push(new Data(builder, data.open + 1, data.closed));
                }
                if (data.closed < data.open) {
                    var builder = new StringBuilder(data.builder).append(')');
                    stack.push(new Data(builder, data.open, data.closed + 1));
                }
            } else {
                result.add(data.builder.toString());
            }
        }

        return result;
    }

    record Data(StringBuilder builder, int open, int closed) {
    }
}
