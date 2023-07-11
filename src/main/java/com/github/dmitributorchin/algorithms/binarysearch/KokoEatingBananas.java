package com.github.dmitributorchin.algorithms.binarysearch;

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours.
 * <p>
 * Koko can decide her bananas-per-hour eating speed of k.
 * Each hour, she chooses some pile of bananas and eats k bananas from that pile.
 * If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * <p>
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * <p>
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        var max = Integer.MIN_VALUE;
        for (var pile : piles) {
            max = Math.max(max, pile);
        }
        var left = 0;
        var right = max;
        var speed = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            var hours = 0;
            for (int pile : piles) {
                hours += Math.ceil(pile / (double) middle);
            }
            if (hours <= h) {
                speed = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return speed;
    }
}
