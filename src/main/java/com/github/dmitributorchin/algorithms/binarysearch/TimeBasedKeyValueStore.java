package com.github.dmitributorchin.algorithms.binarysearch;

import java.util.*;

/**
 * Design a time-based key-value data structure that can store multiple values for the same key at different time stamps
 * and retrieve the key's value at a certain timestamp.
 * <p>
 * Implement the TimeMap class:
 * TimeMap() Initializes the object of the data structure.
 * void set(String key, String value, int timestamp)
 * Stores the key key with the value value at the given time timestamp.
 * String get(String key, int timestamp)
 * Returns a value such that set was called previously, with timestamp_prev <= timestamp.
 * If there are multiple such values, it returns the value associated with the largest timestamp_prev.
 * If there are no values, it returns "".
 */
public class TimeBasedKeyValueStore {
    private final Map<String, List<Pair>> values;

    public TimeBasedKeyValueStore() {
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        var list = values.getOrDefault(key, new ArrayList<>());
        if (!values.containsKey(key)) {
            values.put(key, list);
        }
        list.add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        var result = "";
        var list = values.getOrDefault(key, Collections.emptyList());

        var left = 0;
        var right = list.size() - 1;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            if (list.get(middle).timestamp() <= timestamp) {
                result = list.get(middle).value();
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }
}

record Pair(int timestamp, String value) {
}
