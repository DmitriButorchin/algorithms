package com.github.dmitributorchin.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists solver;

    @BeforeEach
    void setUp() {
        solver = new MergeTwoSortedLists();
    }

    @Test
    void test1() {
        var actual = solver.mergeTwoLists(
                ListNode.create(1, 2, 4),
                ListNode.create(1, 3, 4)
        );
        assertEquals(ListNode.create(1, 1, 2, 3, 4, 4), actual);
    }

    @Test
    void test2() {
        var actual = solver.mergeTwoLists(
                null,
                null
        );
        assertNull(actual);
    }

    @Test
    void test3() {
        var actual = solver.mergeTwoLists(
                null,
                ListNode.create(0)
        );
        assertEquals(ListNode.create(0), actual);
    }
}
