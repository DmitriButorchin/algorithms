package com.github.dmitributorchin.algorithms.stacks;

import java.util.Stack;

/**
 * Given an array of integers heights representing the histogram's bar height
 * where the width of each bar is 1,
 * return the area of the largest rectangle in the histogram.
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        var max = 0;

        var stack = new Stack<Data>();
        for (var i = 0; i < heights.length; i++) {
            var index = i;

            while (!stack.isEmpty() && heights[i] < stack.peek().height) {
                var data = stack.pop();
                var area = data.height * (i - data.index);
                max = Math.max(max, area);
                index = data.index;
            }

            stack.push(new Data(index, heights[i]));
        }

        while (!stack.isEmpty()) {
            var data = stack.pop();
            var area = data.height * (heights.length - data.index);
            max = Math.max(max, area);
        }

        return max;
    }

    private record Data(int index, int height) {
    }
}
