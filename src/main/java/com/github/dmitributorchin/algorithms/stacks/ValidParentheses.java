package com.github.dmitributorchin.algorithms.stacks;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    private static final char OPEN_ROUND = '(';
    private static final char CLOSE_ROUND = ')';
    private static final char OPEN_SQUIGGLY = '{';
    private static final char CLOSE_SQUIGGLY = '}';
    private static final char OPEN_SQUARE = '[';
    private static final char CLOSE_SQUARE = ']';

    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (var character : s.toCharArray()) {
            if (OPEN_ROUND == character || OPEN_SQUIGGLY == character || OPEN_SQUARE == character) {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                var open = stack.pop();
                if ((OPEN_ROUND == open && CLOSE_ROUND != character)
                        || (OPEN_SQUIGGLY == open && CLOSE_SQUIGGLY != character)
                        || (OPEN_SQUARE == open && CLOSE_SQUARE != character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
