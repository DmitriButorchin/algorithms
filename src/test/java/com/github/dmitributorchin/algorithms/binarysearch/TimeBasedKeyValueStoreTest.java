package com.github.dmitributorchin.algorithms.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeBasedKeyValueStoreTest {
    TimeBasedKeyValueStore map;

    @BeforeEach
    void setUp() {
        map = new TimeBasedKeyValueStore();
    }

    @Test
    void test1() {
        map.set("foo", "bar", 1);
        assertEquals("bar", map.get("foo", 1));
        assertEquals("bar", map.get("foo", 3));

        map.set("foo", "bar2", 4);
        assertEquals("bar2", map.get("foo", 4));
        assertEquals("bar2", map.get("foo", 5));
    }
}
