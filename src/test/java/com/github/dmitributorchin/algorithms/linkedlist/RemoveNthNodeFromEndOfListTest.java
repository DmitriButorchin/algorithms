package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList solver;

    @BeforeEach
    void setUp() {
        solver = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void test1() {
        var actual = solver.removeNthFromEnd(ListNode.create(1, 2, 3, 4, 5), 2);
        assertEquals(ListNode.create(1, 2, 3, 5), actual);
    }

    @Test
    void test2() {
        var actual = solver.removeNthFromEnd(ListNode.create(1), 1);
        assertNull(actual);
    }

    @Test
    void test3() {
        var actual = solver.removeNthFromEnd(ListNode.create(1, 2), 1);
        assertEquals(ListNode.create(1), actual);
    }
}
