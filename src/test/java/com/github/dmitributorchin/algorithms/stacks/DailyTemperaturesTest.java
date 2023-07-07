package com.github.dmitributorchin.algorithms.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyTemperaturesTest {
    DailyTemperatures solver;

    @BeforeEach
    void setUp() {
        solver = new DailyTemperatures();
    }

    @Test
    void test1() {
        var actual = solver.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        assertThat(actual).containsExactly(1, 1, 4, 2, 1, 1, 0, 0);
    }

    @Test
    void test2() {
        var actual = solver.dailyTemperatures(new int[]{30, 40, 50, 60});
        assertThat(actual).containsExactly(1, 1, 1, 0);
    }

    @Test
    void test3() {
        var actual = solver.dailyTemperatures(new int[]{30, 60, 90});
        assertThat(actual).containsExactly(1, 1, 0);
    }
}