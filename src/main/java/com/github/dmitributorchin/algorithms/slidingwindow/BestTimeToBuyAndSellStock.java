package com.github.dmitributorchin.algorithms.slidingwindow;

/**
	You are given an array prices where prices[i]
	is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day
	to buy one stock and choosing a different day in the future to sell that stock.

	Return the maximum profit you can achieve from this transaction.
	If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        var max = 0;

        var left = 0;
        var current = left + 1;
        while (current < prices.length) {
            max = Math.max(max, prices[current] - prices[left]);
            if (prices[current] < prices[left]) {
                left = current;
            }
            current++;
        }

        return max;
    }
}
