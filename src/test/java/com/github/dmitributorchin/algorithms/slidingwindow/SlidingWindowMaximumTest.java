package com.github.dmitributorchin.algorithms.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SlidingWindowMaximumTest {
    SlidingWindowMaximum solver;

    @BeforeEach
    void setUp() {
        solver = new SlidingWindowMaximum();
    }

    @Test
    void test1() {
        var actual = solver.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        assertThat(actual).containsExactly(3, 3, 5, 5, 6, 7);
    }

    @Test
    void test2() {
        var actual = solver.maxSlidingWindow(new int[]{1}, 1);
        assertThat(actual).containsExactly(1);
    }
}