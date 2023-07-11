package com.github.dmitributorchin.algorithms.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

/**
 * You are given an array of integers nums,
 * there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        var result = new int[nums.length - k + 1];

        Deque<Integer> queue = new LinkedList<>();
        var left = 0;
        for (var right = 0; right < nums.length; right++) {
            while (!queue.isEmpty() && nums[right] > nums[queue.peekFirst()]) {
                queue.removeFirst();
            }
            queue.offerFirst(right);

            if (left > queue.peekLast()) {
                queue.removeLast();
            }

            if (right + 1 >= k) {
                result[left] = nums[queue.peekLast()];
                left++;
            }
        }

        return result;
    }
}
