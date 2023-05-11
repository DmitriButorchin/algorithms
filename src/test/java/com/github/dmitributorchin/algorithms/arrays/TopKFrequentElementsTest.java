package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {
    TopKFrequentElements solver;

    @BeforeEach
    void setUp() {
        solver = new TopKFrequentElements();
    }

    @Test
    void topKFrequent1() {
        var actual = solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    void topKFrequent2() {
        var actual = solver.topKFrequent(new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, actual);
    }
}
