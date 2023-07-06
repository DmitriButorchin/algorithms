package com.github.dmitributorchin.algorithms.arrays;

import java.util.HashSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        for (var num : nums) {
            set.add(num);
        }

        var max = 0;
        for (var num : set) {
            if (!set.contains(num - 1)) {
                var length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                max = Math.max(max, length);
            }
        }

        return max;
    }
}
