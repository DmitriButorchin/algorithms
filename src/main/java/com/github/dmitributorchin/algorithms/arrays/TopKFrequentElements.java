package com.github.dmitributorchin.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an integer array nums and an integer k,
 * return the k most frequent elements.
 * You may return the answer in any order.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        var hash = new HashMap<Integer, Integer>();
        for (var num : nums) {
            hash.compute(num, (key, count) -> count == null ? 1 : count + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (var entry : hash.entrySet()) {
            if (bucket[entry.getValue()] == null) {
                bucket[entry.getValue()] = new ArrayList<>();
            }
            bucket[entry.getValue()].add(entry.getKey());
        }

        var result = new int[k];
        var index = 0;
        for (var i = bucket.length - 1; i > 0 && k > 0; i--) {
            if (bucket[i] != null) {
                for (var element : bucket[i]) {
                    result[index] = element;
                    k--;
                    index++;
                }
            }
        }

        return result;
    }
}
