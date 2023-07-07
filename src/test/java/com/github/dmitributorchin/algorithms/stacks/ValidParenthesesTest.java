package com.github.dmitributorchin.algorithms.stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    ValidParentheses solver;

    @BeforeEach
    void setUp() {
        solver = new ValidParentheses();
    }

    @Test
    void test1() {
        var actual = solver.isValid("()");
        Assertions.assertTrue(actual);
    }

    @Test
    void test2() {
        var actual = solver.isValid("()[]{}");
        Assertions.assertTrue(actual);
    }

    @Test
    void test3() {
        var actual = solver.isValid("(]");
        Assertions.assertFalse(actual);
    }

    @Test
    void test4() {
        var actual = solver.isValid("([]({})[])");
        Assertions.assertTrue(actual);
    }

    @Test
    void test5() {
        var actual = solver.isValid("][]");
        Assertions.assertFalse(actual);
    }

    @Test
    void test6() {
        var actual = solver.isValid("[]]");
        Assertions.assertFalse(actual);
    }

    @Test
    void test7() {
        var actual = solver.isValid("[][");
        Assertions.assertFalse(actual);
    }
}