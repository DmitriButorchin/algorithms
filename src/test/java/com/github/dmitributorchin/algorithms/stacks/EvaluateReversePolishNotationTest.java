package com.github.dmitributorchin.algorithms.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation solver;

    @BeforeEach
    void setUp() {
        solver = new EvaluateReversePolishNotation();
    }

    @Test
    void test1() {
        var actual = solver.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        assertEquals(9, actual);
    }

    @Test
    void test2() {
        var actual = solver.evalRPN(new String[]{"4", "13", "5", "/", "+"});
        assertEquals(6, actual);
    }

    @Test
    void test3() {
        var actual = solver.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        assertEquals(22, actual);
    }
}