/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (32.84%)
 * Likes:    735
 * Dislikes: 2152
 * Total Accepted:    431K
 * Total Submissions: 1.3M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "race a car"
 * Output: false
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            boolean validStart = Character.isLetterOrDigit(s.charAt(start));
            boolean validEnd = Character.isLetterOrDigit(s.charAt(end));
            if (!validStart) {
                start++;
            }
            if (!validEnd) {
                end--;
            }
            if (validStart && 
                validEnd && 
                Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--))) {
                return false;
            }

        }
        return true;
    }

}

// @lc code=end

