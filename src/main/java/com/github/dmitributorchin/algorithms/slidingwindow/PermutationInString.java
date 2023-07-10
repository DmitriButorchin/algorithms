package com.github.dmitributorchin.algorithms.slidingwindow;

/**
	Given two strings s1 and s2,
	return true if s2 contains a permutation of s1, or false otherwise.

	In other words, return true if one of s1's permutations
	is the substring of s2.
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        var firstCount = new int[26];
        var secondCount = new int[26];
        for (var i = 0; i < s1.length(); i++) {
            firstCount[s1.charAt(i) - 'a']++;
            secondCount[s2.charAt(i) - 'a']++;
        }
        
        var matches = 0;
        for (var i = 0; i < 26; i++) {
            if (secondCount[i] == firstCount[i]) {
                matches++;
            }
        }

        var left = 0;
        for (var i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) {
                return true;
            }

            var index = s2.charAt(i) - 'a';
            secondCount[index]++;
            if (secondCount[index] == firstCount[index]) {
                matches++;
            } else if (secondCount[index] - 1 == firstCount[index]) {
                matches--;
            }

            index = s2.charAt(left) - 'a';
            secondCount[index]--;
            if (secondCount[index] == firstCount[index]) {
                matches++;
            } else if (secondCount[index] + 1 == firstCount[index]) {
                matches--;
            }
            left++;      
        }

        return matches == 26;
    }
}
