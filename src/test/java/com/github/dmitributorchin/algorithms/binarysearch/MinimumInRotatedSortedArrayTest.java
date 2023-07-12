package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumInRotatedSortedArrayTest {
    MinimumInRotatedSortedArray solver;

    @BeforeEach
    void setUp() {
        solver = new MinimumInRotatedSortedArray();
    }

    @Test
    void test1() {
        var actual = solver.findMin(new int[]{3, 4, 5, 1, 2});
        assertEquals(1, actual);
    }

    @Test
    void test2() {
        var actual = solver.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        assertEquals(0, actual);
    }

    @Test
    void test3() {
        var actual = solver.findMin(new int[]{11, 13, 15, 17});
        assertEquals(11, actual);
    }
}
