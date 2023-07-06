package com.github.dmitributorchin.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string.
 * The encoded string is then sent over the network and is decoded back to the original list of strings.
 */
public class EncodeAndDecodeStrings {
    private static final char SEPARATOR = ';';

    public String encode(List<String> strs) {
        var result = new StringBuilder();
        for (var str : strs) {
            result.append(str.length());
            result.append(SEPARATOR);
            result.append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();

        var left = 0;
        while (left < str.length()) {
            var right = left;
            while (str.charAt(right) != SEPARATOR) {
                right++;
            }
            var length = Integer.parseInt(str.substring(left, right));
            var word = str.substring(right + 1, right + 1 + length);
            result.add(word);
            left = right + 1 + length;
        }

        return result;
    }
}
