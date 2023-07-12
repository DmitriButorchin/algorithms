package com.github.dmitributorchin.algorithms.binarysearch;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        var min = Integer.MAX_VALUE;
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            min = Math.min(min, nums[middle]);
            if (nums[right] < nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return min;
    }
}
