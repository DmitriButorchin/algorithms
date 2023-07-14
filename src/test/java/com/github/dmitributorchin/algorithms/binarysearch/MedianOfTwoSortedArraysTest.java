package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays solver;

    @BeforeEach
    void setUp() {
        solver = new MedianOfTwoSortedArrays();
    }

    @Test
    void test1() {
        var actual = solver.findMedianSortedArrays(
                new int[]{1, 3},
                new int[]{2}
        );
        assertEquals(2, actual);
    }

    @Test
    void test2() {
        var actual = solver.findMedianSortedArrays(
                new int[]{1, 2},
                new int[]{3, 4}
        );
        assertEquals(2.5, actual);
    }

    @Test
    void test3() {
        var actual = solver.findMedianSortedArrays(
                new int[]{2},
                new int[]{}
        );
        assertEquals(2, actual);
    }

    @Test
    void test4() {
        var actual = solver.findMedianSortedArrays(
                new int[]{1, 5, 6, 7, 9},
                new int[]{3, 4, 4, 8}
        );
        assertEquals(5, actual);
    }

    @Test
    void test5() {
        var actual = solver.findMedianSortedArrays(
                new int[]{1, 2, 5, 7, 9, 10},
                new int[]{3, 4, 6, 8}
        );
        assertEquals(5.5, actual);
    }

    @Test
    void test6() {
        var actual = solver.findMedianSortedArrays(
                new int[]{1, 2, 5, 7, 9},
                new int[]{3, 4, 6, 8}
        );
        assertEquals(5, actual);
    }
}
