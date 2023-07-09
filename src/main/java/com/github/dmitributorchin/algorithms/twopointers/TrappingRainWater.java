package com.github.dmitributorchin.algorithms.twopointers;

/**
	Given n non-negative integers representing an elevation map
	where the width of each bar is 1,
	compute how much water it can trap after raining.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        var result = 0;

        var left = 0;
        var right = height.length - 1;
        var leftMax = height[left];
        var rightMax = height[right];
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
            }
        }

        return result;
    }
}
