package com.github.dmitributorchin.algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.dmitributorchin.algorithms.arrays.ValidSudoku.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSudokuTest {
    ValidSudoku solver;

    @BeforeEach
    void setUp() {
        solver = new ValidSudoku();
    }

    @Test
    void isValidSudokuRows() {
        var board = new char[][]{
                {ONE, TWO, THREE, EMPTY, EMPTY, EMPTY, EMPTY, FOUR, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    void isNotValidSudokuRows() {
        var board = new char[][]{
                {ONE, TWO, THREE, EMPTY, EMPTY, EMPTY, EMPTY, TWO, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertFalse(actual);
    }

    @Test
    void isValidSudokuColumns() {
        var board = new char[][]{
                {ONE, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {TWO, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {THREE, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {FOUR, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    void isNotValidSudokuColumns() {
        var board = new char[][]{
                {ONE, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {TWO, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {THREE, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {TWO, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertFalse(actual);
    }

    @Test
    void isValidSudokuSquares() {
        var board = new char[][]{
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, ONE, EMPTY, FOUR},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, TWO, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, THREE, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    void isNotValidSudokuSquares() {
        var board = new char[][]{
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, ONE, EMPTY, FOUR},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, TWO, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, FOUR, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
        var actual = solver.isValidSudoku(board);
        assertFalse(actual);
    }

    @Test
    void isValidSudoku() {
        var board = new char[][]{
                {FIVE, THREE, EMPTY, EMPTY, SEVEN, EMPTY, EMPTY, EMPTY, EMPTY},
                {SIX, EMPTY, EMPTY, ONE, NINE, FIVE, EMPTY, EMPTY, EMPTY},
                {EMPTY, NINE, EIGHT, EMPTY, EMPTY, EMPTY, EMPTY, SIX, EMPTY},
                {EIGHT, EMPTY, EMPTY, EMPTY, SIX, EMPTY, EMPTY, EMPTY, THREE},
                {FOUR, EMPTY, EMPTY, EIGHT, EMPTY, THREE, EMPTY, EMPTY, ONE},
                {SEVEN, EMPTY, EMPTY, EMPTY, TWO, EMPTY, EMPTY, EMPTY, SIX},
                {EMPTY, SIX, EMPTY, EMPTY, EMPTY, EMPTY, TWO, EIGHT, EMPTY},
                {EMPTY, EMPTY, EMPTY, FOUR, ONE, NINE, EMPTY, EMPTY, FIVE},
                {EMPTY, EMPTY, EMPTY, EMPTY, EIGHT, EMPTY, EMPTY, SEVEN, NINE},
        };
        var actual = solver.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    void isNotValidSudoku() {
        var board = new char[][]{
                {EIGHT, THREE, EMPTY, EMPTY, SEVEN, EMPTY, EMPTY, EMPTY, EMPTY},
                {SIX, EMPTY, EMPTY, ONE, NINE, FIVE, EMPTY, EMPTY, EMPTY},
                {EMPTY, NINE, EIGHT, EMPTY, EMPTY, EMPTY, EMPTY, SIX, EMPTY},
                {EIGHT, EMPTY, EMPTY, EMPTY, SIX, EMPTY, EMPTY, EMPTY, THREE},
                {FOUR, EMPTY, EMPTY, EIGHT, EMPTY, THREE, EMPTY, EMPTY, ONE},
                {SEVEN, EMPTY, EMPTY, EMPTY, TWO, EMPTY, EMPTY, EMPTY, SIX},
                {EMPTY, SIX, EMPTY, EMPTY, EMPTY, EMPTY, TWO, EIGHT, EMPTY},
                {EMPTY, EMPTY, EMPTY, FOUR, ONE, NINE, EMPTY, EMPTY, FIVE},
                {EMPTY, EMPTY, EMPTY, EMPTY, EIGHT, EMPTY, EMPTY, SEVEN, NINE},
        };
        var actual = solver.isValidSudoku(board);
        assertFalse(actual);
    }
}
