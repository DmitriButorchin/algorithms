package com.github.dmitributorchin.algorithms.twopointers;

/**
    Given an integer array nums,
    return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k,
    and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.
 */
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length) {
            if (index == 0 || nums[index - 1] != nums[index]) {
                result.addAll(twoSum(nums, index));
            }

            index++;
        }

        return result;
    }

    private List<List<Integer>> twoSum(int[] nums, int index) {
        var result = new ArrayList<List<Integer>>();

        int left = index + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[index] + nums[left] + nums[right];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(List.of(nums[index], nums[left], nums[right]));
                left++;
                while (nums[left] == nums[left - 1] && left < right) {
                    left++;
                }
            }
        }

        return result;
    }
}