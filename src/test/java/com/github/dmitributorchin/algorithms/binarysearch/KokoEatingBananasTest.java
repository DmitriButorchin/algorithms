package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest {
    KokoEatingBananas solver;

    @BeforeEach
    void setUp() {
        solver = new KokoEatingBananas();
    }

    @Test
    void test1() {
        var actual = solver.minEatingSpeed(new int[]{3, 6, 7, 11}, 8);
        assertEquals(4, actual);
    }

    @Test
    void test2() {
        var actual = solver.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5);
        assertEquals(30, actual);
    }

    @Test
    void test3() {
        var actual = solver.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6);
        assertEquals(23, actual);
    }
}
