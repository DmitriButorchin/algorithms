package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReorderListTest {
    ReorderList solver;

    @BeforeEach
    void setUp() {
        solver = new ReorderList();
    }

    @Test
    void test1() {
        var list = ListNode.create(1, 2, 3, 4);
        solver.reorderList(list);
        assertEquals(ListNode.create(1, 4, 2, 3), list);
    }

    @Test
    void test2() {
        var list = ListNode.create(1, 2, 3, 4, 5);
        solver.reorderList(list);
        assertEquals(ListNode.create(1, 5, 2, 4, 3), list);
    }
}
