package com.github.dmitributorchin.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid.
 * Only the filled cells need to be validated according to the following rules:
 * - Each row must contain the digits 1-9 without repetition.
 * - Each column must contain the digits 1-9 without repetition.
 * - Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9
 * without repetition.
 * <p>
 * Note:
 * - A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * - Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {
    public static final char EMPTY = '.';
    public static final char ONE = '1';
    public static final char TWO = '2';
    public static final char THREE = '3';
    public static final char FOUR = '4';
    public static final char FIVE = '5';
    public static final char SIX = '6';
    public static final char SEVEN = '7';
    public static final char EIGHT = '8';
    public static final char NINE = '9';

    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new Set[9];
        Set<Character>[] columns = new Set[9];
        Set<Character>[] squares = new Set[9];
        for (var i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            for (var j = 0; j < 9; j++) {
                if (i == 0) {
                    columns[j] = new HashSet<>();
                }
                var squareIndex = (i / 3) * 3 + j / 3;
                if (i % 3 == 0 && j % 3 == 0) {
                    squares[squareIndex] = new HashSet<>();
                }

                var cell = board[i][j];
                if (EMPTY != cell) {
                    if (rows[i].contains(cell)
                            || columns[j].contains(cell)
                            || squares[squareIndex].contains(cell)) {
                        return false;
                    }
                    rows[i].add(cell);
                    columns[j].add(cell);
                    squares[squareIndex].add(cell);
                }
            }
        }

        return true;
    }
}
