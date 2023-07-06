package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence solver;

    @BeforeEach
    void setUp() {
        solver = new LongestConsecutiveSequence();
    }

    @Test
    void sequence() {
        var actual = solver.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        assertEquals(4, actual);
    }
}