package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EncodeAndDecodeStringsTest {
    EncodeAndDecodeStrings solver;

    @BeforeEach
    void setUp() {
        solver = new EncodeAndDecodeStrings();
    }

    @Test
    void test1() {
        var input = List.of("lint", "code", "love", "you");
        var encoded = solver.encode(input);
        var decoded = solver.decode(encoded);
        assertArrayEquals(input.toArray(), decoded.toArray());
    }

    @Test
    void test2() {
        var input = List.of("we", "say", ";", "yes");
        var encoded = solver.encode(input);
        var decoded = solver.decode(encoded);
        assertArrayEquals(input.toArray(), decoded.toArray());
    }
}
