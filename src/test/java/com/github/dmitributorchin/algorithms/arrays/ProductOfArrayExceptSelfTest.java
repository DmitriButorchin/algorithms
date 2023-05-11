package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf solver;

    @BeforeEach
    void setUp() {
        solver = new ProductOfArrayExceptSelf();
    }

    @Test
    void productExceptSelf1() {
        var actual = solver.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{24, 12, 8, 6}, actual);
    }

    @Test
    void productExceptSelf2() {
        var actual = solver.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, actual);
    }
}
