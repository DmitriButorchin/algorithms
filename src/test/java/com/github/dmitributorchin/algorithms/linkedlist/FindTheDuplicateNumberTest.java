package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumberTest {
    FindTheDuplicateNumber solver;

    @BeforeEach
    void setUp() {
        solver = new FindTheDuplicateNumber();
    }

    @Test
    void test1() {
        var actual = solver.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2, actual);
    }

    @Test
    void test2() {
        var actual = solver.findDuplicate(new int[]{3, 1, 3, 4, 2});
        assertEquals(3, actual);
    }
}
