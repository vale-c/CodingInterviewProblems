/*
 * @lc app=leetcode id=714 lang=java
 *
 * [714] Best Time to Buy and Sell Stock with Transaction Fee
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
 *
 * algorithms
 * Medium (52.10%)
 * Likes:    1104
 * Dislikes: 33
 * Total Accepted:    49.9K
 * Total Submissions: 95.7K
 * Testcase Example:  '[1,3,2,8,4,9]\n2'
 *
 * Your are given an array of integers prices, for which the i-th element is
 * the price of a given stock on day i; and a non-negative integer fee
 * representing a transaction fee.
 * You may complete as many transactions as you like, but you need to pay the
 * transaction fee for each transaction.  You may not buy more than 1 share of
 * a stock at a time (ie. you must sell the stock share before you buy again.)
 * Return the maximum profit you can make.
 * 
 * Example 1:
 * 
 * Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * Output: 8
 * Explanation: The maximum profit can be achieved by:
 * Buying at prices[0] = 1Selling at prices[3] = 8Buying at prices[4] =
 * 4Selling at prices[5] = 9The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) =
 * 8.
 * 
 * 
 * 
 * Note:
 * 0 < prices.length .
 * 0 < prices[i] < 50000.
 * 0 .
 * 
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        // s0 = profit having no stock
        // s1 = profit having 1 stock
        int s0 = 0;
        int s1 = Integer.MIN_VALUE;

        for (int p: prices) {
            int tmp = s0;
            s0 = Math.max(s0, s1+p); // update s0 by selling the stock from s1, so s0 = max(s0, s1+p);
            s1 = Math.max(s1, tmp-p-fee); // update s1 by buying the stock from s0, so s1 = max(s1,s0-p-fee);
        }
        return s0;
    }
}
// @lc code=end

