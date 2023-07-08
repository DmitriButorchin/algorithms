package com.github.dmitributorchin.algorithms.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    ValidPalindrome solver;

    @BeforeEach
    void setUp() {
        solver = new ValidPalindrome();
    }

    @Test
    void test1() {
        var actual = solver.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(actual);
    }

    @Test
    void test2() {
        var actual = solver.isPalindrome("race a car");
        assertFalse(actual);
    }

    @Test
    void test3() {
        var actual = solver.isPalindrome(" ");
        assertTrue(actual);
    }

    @Test
    void test4() {
        var actual = solver.isPalindrome(".,");
        assertTrue(actual);
    }
}
