package com.github.dmitributorchin.algorithms.slidingwindow;

/**
	Given two strings s and t of lengths m and n respectively,
	return the minimum window substring of s
	such that every character in t (including duplicates)
	is included in the window.
	If there is no such substring, return the empty string "".

	The testcases will be generated such that the answer is unique.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        var targetMap = new HashMap<Character, Integer>();
        for (var character : t.toCharArray()) {
            var count = targetMap.getOrDefault(character, 0) + 1;
            targetMap.put(character, count);
        }

        var left = 0;
        var min = Integer.MAX_VALUE;
        var minIndex = 0;
        var sourceMap = new HashMap<Character, Integer>();
        var matches = 0;
        var right = 0;
        for (right = 0; right < s.length(); right++) {
            var character = s.charAt(right);
            sourceMap.put(character, sourceMap.getOrDefault(character, 0) + 1);
            if (targetMap.containsKey(character)) {
                int target = targetMap.get(character);
                int source = sourceMap.get(character);
                if (target == source) {
                    matches++;
                }
            }

            while (matches == targetMap.size()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    minIndex = left;
                }

                left++;
                var previous = s.charAt(left - 1);
                sourceMap.put(previous, sourceMap.get(previous) - 1);
                if (targetMap.containsKey(previous)
                    && targetMap.get(previous) > sourceMap.get(previous)) {
                        matches--;
                    }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(minIndex, minIndex + min);
    }
}
