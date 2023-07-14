package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {
    ReverseLinkedList solver;

    @BeforeEach
    void setUp() {
        solver = new ReverseLinkedList();
    }

    @Test
    void test1() {
        var head = ListNode.create(1, 2, 3, 4, 5);
        var actual = solver.reverseList(head);
        var expected = ListNode.create(5, 4, 3, 2, 1);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var head = ListNode.create(1, 2);
        var actual = solver.reverseList(head);
        var expected = ListNode.create(2, 1);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var actual = solver.reverseList(null);
        assertNull(actual);
    }
}
