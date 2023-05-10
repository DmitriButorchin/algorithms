package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {
    GroupAnagrams solver;

    @BeforeEach
    void setUp() {
        solver = new GroupAnagrams();
    }

    @Test
    void groupAnagrams1() {
        var data = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        var actual = solver.groupAnagrams(data);
        for (var result : actual) {
            Collections.sort(result);
        }
        actual.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.get(0), o2.get(0)));
        var expected = asList(
                List.of("ate", "eat", "tea"),
                List.of("bat"),
                List.of("nat", "tan")
        );
        assertEquals(expected, actual);
    }

    @Test
    void groupAnagrams2() {
        var data = new String[]{""};
        var actual = solver.groupAnagrams(data);
        var expected = List.of(
                List.of("")
        );
        assertEquals(expected, actual);
    }

    @Test
    void groupAnagrams3() {
        var data = new String[]{"a"};
        var actual = solver.groupAnagrams(data);
        var expected = List.of(
                List.of("a")
        );
        assertEquals(expected, actual);
    }
}
