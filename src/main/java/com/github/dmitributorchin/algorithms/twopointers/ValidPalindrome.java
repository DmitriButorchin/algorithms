package com.github.dmitributorchin.algorithms.twopointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters,
 * it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var left = 0;
        var right = s.length() - 1;
        while (left < right) {
            if (!isAlphanumeric(s.charAt(left))) {
                left++;
            } else if (!isAlphanumeric(s.charAt(right))) {
                right--;
            } else if ((Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    private boolean isAlphanumeric(char character) {
        return Character.isAlphabetic(character) || Character.isDigit(character);
    }
}
