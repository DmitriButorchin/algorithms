package com.github.dmitributorchin.algorithms.slidingwindow;

/**
	You are given a string s and an integer k.
	You can choose any character of the string and change it
	to any other uppercase English character.
	You can perform this operation at most k times.

	Return the length of the longest substring
	containing the same letter you can get
	after performing the above operations.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        var result = 0;

        var map = new int[26];
        var left = 0;
        var frequency = 0;
        for (var right = 0; right < s.length(); right++) {
            var character = s.charAt(right);
            map[character - 'A']++;
            frequency = Math.max(frequency,  map[character - 'A']);
            var length = right - left + 1;
            if (frequency + k < length) {
                map[s.charAt(left) - 'A']--;
                left++;
            } else {
                result = Math.max(result, length);
            }
        }

        return result;
    }
}
