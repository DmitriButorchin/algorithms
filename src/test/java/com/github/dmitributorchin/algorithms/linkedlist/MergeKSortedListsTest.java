package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeKSortedListsTest {
    MergeKSortedLists solver;

    @BeforeEach
    void setUp() {
        solver = new MergeKSortedLists();
    }

    @Test
    void test1() {
        var actual = solver.mergeKLists(new ListNode[]{
                ListNode.create(1, 4, 5),
                ListNode.create(1, 3, 4),
                ListNode.create(2, 6),
        });
        assertEquals(ListNode.create(1, 1, 2, 3, 4, 4, 5, 6), actual);
    }

    @Test
    void test2() {
        var actual = solver.mergeKLists(new ListNode[]{});
        assertNull(actual);
    }

    @Test
    void test3() {
        var actual = solver.mergeKLists(new ListNode[]{null});
        assertNull(actual);
    }
}
