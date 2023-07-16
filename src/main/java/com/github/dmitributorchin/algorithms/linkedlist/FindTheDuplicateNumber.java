package com.github.dmitributorchin.algorithms.linkedlist;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * <p>
 * There is only one repeated number in nums, return this repeated number.
 * <p>
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        var slow = 0;
        var fast = slow;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        do {
            slow = nums[slow];
            fast = nums[fast];
        } while (slow != fast);

        return slow;
    }
}
