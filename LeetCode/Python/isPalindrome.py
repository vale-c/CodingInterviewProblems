# 125. Palindrome

# A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

# Given a string s, return true if it is a palindrome, or false otherwise.


class Solution:
    def isPalindrome(self, s: str) -> bool:
        alpha = ''.join(char for char in s.lower() if char.isalnum())
        
        start = 0
        end = len(alpha)-1
        
        if s == ' ':
            return True
        
        while (start < end):
            if alpha[start] != alpha[end]:              
                return False
            else:
                start += 1
                end -= 1
        return True
     