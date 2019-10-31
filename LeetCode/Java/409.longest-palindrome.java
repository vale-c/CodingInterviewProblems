/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (48.92%)
 * Likes:    654
 * Dislikes: 66
 * Total Accepted:    114K
 * Total Submissions: 233K
 * Testcase Example:  '"abccccdd"'
 *
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome
 * here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * 
 * Example: 
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() >= 1010) { // boundary checks
            return 0;
        }

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }

        int odd = set.isEmpty() ? 0 : 1;
        return s.length() - set.size() + odd;
    }
}
// @lc code=end

