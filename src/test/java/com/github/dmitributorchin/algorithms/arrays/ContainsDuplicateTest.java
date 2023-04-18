package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    ContainsDuplicate solver;

    @BeforeEach
    void setUp() {
        solver = new ContainsDuplicate();
    }

    @Test
    void oneDuplicate() {
        var input = new int[]{1, 2, 3, 1};
        var actual = solver.containsDuplicate(input);
        assertTrue(actual);
    }

    @Test
    void noDuplicates() {
        var input = new int[]{1, 2, 3, 4};
        var actual = solver.containsDuplicate(input);
        assertFalse(actual);
    }

    @Test
    void multipleDuplicates() {
        var input = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        var actual = solver.containsDuplicate(input);
        assertTrue(actual);
    }
}
