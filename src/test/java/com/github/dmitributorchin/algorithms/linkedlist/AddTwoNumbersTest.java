package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {
    AddTwoNumbers solver;

    @BeforeEach
    void setUp() {
        solver = new AddTwoNumbers();
    }

    @Test
    void test1() {
        var actual = solver.addTwoNumbers(
                ListNode.create(2, 4, 3),
                ListNode.create(5, 6, 4)
        );
        assertEquals(ListNode.create(7, 0, 8), actual);
    }

    @Test
    void test2() {
        var actual = solver.addTwoNumbers(
                ListNode.create(0),
                ListNode.create(0)
        );
        assertEquals(ListNode.create(0), actual);
    }

    @Test
    void test3() {
        var actual = solver.addTwoNumbers(
                ListNode.create(9, 9, 9, 9, 9, 9, 9),
                ListNode.create(9, 9, 9, 9)
        );
        assertEquals(ListNode.create(8, 9, 9, 9, 0, 0, 0, 1), actual);
    }
}
