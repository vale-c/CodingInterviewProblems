/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int a_p = 0;
        int b_p = s.length-1;

        while (a_p <= b_p) {
            char tmp = s[a_p];
            s[a_p] = s[b_p];
            s[b_p] = tmp;

            a_p+=1;
            b_p-=1;

        }

    }
}
// @lc code=end

