package com.github.dmitributorchin.algorithms.arrays;

import java.util.HashSet;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var visited = new HashSet<Integer>();
        for (var num : nums) {
            if (visited.contains(num)) {
                return true;
            }

            visited.add(num);
        }

        return false;
    }
}
