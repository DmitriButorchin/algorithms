package com.github.dmitributorchin.algorithms.arrays;

/**
 * Given an integer array nums,
 * return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums
 * is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time
 * and without using the division operation.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var result = new int[nums.length];
        var product = 1;
        for (var i = 0; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (var i = nums.length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }
}
