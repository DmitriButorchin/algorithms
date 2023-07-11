package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void test1() {
        var actual = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(4, actual);
    }

    @Test
    void test2() {
        var actual = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        assertEquals(-1, actual);
    }
}
