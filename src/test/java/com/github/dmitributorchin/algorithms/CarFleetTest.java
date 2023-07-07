package com.github.dmitributorchin.algorithms;

import com.github.dmitributorchin.algorithms.CarFleet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarFleetTest {
    CarFleet solver;

    @BeforeEach
    void setUp() {
        solver = new CarFleet();
    }

    @Test
    void test1() {
        var actual = solver.carFleet(
                12,
                new int[]{10, 8, 0, 5, 3},
                new int[]{2, 4, 1, 1, 3}
        );
        assertEquals(3, actual);
    }

    @Test
    void test2() {
        var actual = solver.carFleet(
                10,
                new int[]{3},
                new int[]{3}
        );
        assertEquals(1, actual);
    }

    @Test
    void test3() {
        var actual = solver.carFleet(
                100,
                new int[]{0, 2, 4},
                new int[]{4, 2, 1}
        );
        assertEquals(1, actual);
    }

    @Test
    void test4() {
        var actual = solver.carFleet(
                10,
                new int[]{8, 3, 7, 4, 6, 5},
                new int[]{4, 4, 4, 4, 4, 4}
        );
        assertEquals(6, actual);
    }
}