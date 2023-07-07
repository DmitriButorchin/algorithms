package com.github.dmitributorchin.algorithms.stacks;

import java.util.Stack;

/**
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * <p>
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * <p>
 * Note that:
 * <p>
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for (var token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                var second = stack.pop();
                var first = stack.pop();
                switch (token) {
                    case "+" -> stack.push(first + second);
                    case "-" -> stack.push(first - second);
                    case "*" -> stack.push(first * second);
                    case "/" -> stack.push(first / second);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
