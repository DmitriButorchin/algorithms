package com.github.dmitributorchin.algorithms.arrays;

/**
 * Given two strings s and t,
 * return true if t is an anagram of s,
 * and false otherwise.
 * <p>
 * An Anagram is a word or phrase
 * formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var hash = new int[26];
        for (var i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }

        for (var count : hash) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
