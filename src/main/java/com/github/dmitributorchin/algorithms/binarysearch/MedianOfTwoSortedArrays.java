package com.github.dmitributorchin.algorithms.binarysearch;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        var left = 0;
        var right = nums1.length;
        while (left <= right) {
            var mid1 = left + (right - left) / 2;
            var mid2 = (nums1.length + nums2.length + 1) / 2 - mid1;

            var maxLeft1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            var minRight1 = (mid1 == nums1.length) ? Integer.MAX_VALUE : nums1[mid1];

            var maxLeft2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            var minRight2 = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((nums1.length + nums2.length) % 2 != 0) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                right = mid1 - 1;
            } else {
                left = mid1 + 1;
            }
        }

        return -1;
    }
}
