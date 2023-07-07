package com.github.dmitributorchin.algorithms.stacks;

import java.util.Stack;

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days
 * you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        var stack = new Stack<Data>();

        for (var i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().temperature) {
                var data = stack.pop();
                result[data.index] = i - data.index;
            }
            stack.push(new Data(temperatures[i], i));
        }

        return result;
    }

    private record Data(int temperature, int index) {
    }
}
