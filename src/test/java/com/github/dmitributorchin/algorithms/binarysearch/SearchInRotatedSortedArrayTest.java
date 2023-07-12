package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray solver;

    @BeforeEach
    void setUp() {
        solver = new SearchInRotatedSortedArray();
    }

    @Test
    void test1() {
        var actual = solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        assertEquals(4, actual);
    }

    @Test
    void test2() {
        var actual = solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        assertEquals(-1, actual);
    }

    @Test
    void test3() {
        var actual = solver.search(new int[]{1}, 0);
        assertEquals(-1, actual);
    }
}
