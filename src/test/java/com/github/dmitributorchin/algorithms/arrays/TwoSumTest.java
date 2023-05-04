package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    TwoSum solver;

    @BeforeEach
    void setUp() {
        solver = new TwoSum();
    }

    @Test
    void firstTwo() {
        var actual = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, actual);
    }

    @Test
    void lastTwo() {
        var actual = solver.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    void onlyTwo() {
        var actual = solver.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, actual);
    }
}
