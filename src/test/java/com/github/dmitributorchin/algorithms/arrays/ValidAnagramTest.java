package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    ValidAnagram solver;

    @BeforeEach
    void setUp() {
        solver = new ValidAnagram();
    }

    @Test
    void isAnagram() {
        var actual = solver.isAnagram("anagram", "nagaram");
        assertTrue(actual);
    }

    @Test
    void isNotAnagram() {
        var actual = solver.isAnagram("rat", "car");
        assertFalse(actual);
    }
}
