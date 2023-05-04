package com.github.dmitributorchin.algorithms.arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var hash = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var first = nums[i];
            var second = target - first;
            if (hash.containsKey(second)) {
                return new int[]{hash.get(second), i};
            }
            hash.put(first, i);
        }

        throw new IllegalArgumentException("No solution available");
    }
}
