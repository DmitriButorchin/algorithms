package com.github.dmitributorchin.algorithms.slidingwindow;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        var length = 0;

        var map = new HashMap<Character, Integer>();
        var left = 0;
        var right = 0;
        while (right < s.length()) {
            var character = s.charAt(right);
            if (map.containsKey(character) && map.get(character) >= left) {
                left = map.get(character) + 1;
            }
            map.put(character, right);
            length = Math.max(length, right - left + 1);

            right++;
        }

        return length;
    }
}
