package stacks;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * <p>
 * You must implement a solution with O(1) time complexity for each function.
 */
public class MinStack {
    private Stack<Integer> elements;
    private Stack<Integer> minimums;

    public MinStack() {
        elements = new Stack<>();
        minimums = new Stack<>();
    }

    public void push(int val) {
        elements.push(val);
        var minimum = minimums.isEmpty() ? val : Math.min(minimums.peek(), val);
        minimums.push(minimum);
    }

    public void pop() {
        if (!elements.isEmpty()) {
            elements.pop();
            minimums.pop();
        }
    }

    public int top() {
        return elements.peek();
    }

    public int getMin() {
        return minimums.peek();
    }
}
