package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {
    Search2DMatrix solver;

    @BeforeEach
    void setUp() {
        solver = new Search2DMatrix();
    }

    @Test
    void test1() {
        var actual = solver.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3);
        assertTrue(actual);
    }

    @Test
    void test2() {
        var actual = solver.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 13);
        assertFalse(actual);
    }
}
