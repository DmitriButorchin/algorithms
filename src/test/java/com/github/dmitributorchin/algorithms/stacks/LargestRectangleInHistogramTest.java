package com.github.dmitributorchin.algorithms.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram solver;

    @BeforeEach
    void setUp() {
        solver = new LargestRectangleInHistogram();
    }

    @Test
    void test1() {
        var actual = solver.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        assertEquals(10, actual);
    }

    @Test
    void test2() {
        var actual = solver.largestRectangleArea(new int[]{2, 4});
        assertEquals(4, actual);
    }

    @Test
    void test3() {
        var actual = solver.largestRectangleArea(new int[]{2, 1, 2});
        assertEquals(3, actual);
    }
}