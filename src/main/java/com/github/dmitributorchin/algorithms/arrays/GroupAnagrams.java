package com.github.dmitributorchin.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by
 * rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hashMap = new HashMap<String, List<String>>();

        for (var str : strs) {
            var hash = hash(str);
            if (!hashMap.containsKey(hash)) {
                hashMap.put(hash, new ArrayList<>());
            }
            hashMap.get(hash).add(str);
        }

        return new ArrayList<>(hashMap.values());
    }

    private String hash(String str) {
        var data = new int[26];

        for (var character : str.toCharArray()) {
            data[character - 'a']++;
        }

        var result = new StringBuilder();
        for (var i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                result.append(data[i]);
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
