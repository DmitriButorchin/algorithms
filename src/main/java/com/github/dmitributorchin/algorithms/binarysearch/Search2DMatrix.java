package com.github.dmitributorchin.algorithms.binarysearch;

/**
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * <p>
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        var left = 0;
        var right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            var row = middle / matrix[0].length;
            var column = middle % matrix[0].length;
            var element = matrix[row][column];
            if (element > target) {
                right = middle - 1;
            } else if (element < target) {
                left = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
