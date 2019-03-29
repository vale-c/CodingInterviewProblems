#Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

# (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

# You are given a target value to search. If found in the array return its index, otherwise return -1.

# You may assume no duplicate exists in the array.

# Your algorithm's runtime complexity must be in the order of O(log n).

# Example 1:

# Input: nums = [4,5,6,7,0,1,2], target = 0
# Output: 4
# Example 2:

# Input: nums = [4,5,6,7,0,1,2], target = 3
# Output: -1

#O(n) Time Solution     
# slower but only 4 lines of code!

#class Solution(object):
    #def search(self, nums, target):
        # for i in range(len(nums)):
        #     if target in nums:
        #         return nums.index(target)
        # return -1

#CORRECT IMPLEMENTATION USING BINARY SEARCH!
class Solution(object):

    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums is None:  # if the array is empty
            return -1

        left, right = 0, len(nums) - 1

        while (left <= right):  # check boundaries
            mid = (left + right) / 2

            if (nums[mid] == target):  # if the target corresponds to the mid element in the array
                return mid

            if nums[left] <= nums[mid]:  # leftmost side
                # if the target is in the left side of the array
                if nums[left] <= target <= nums[mid]:
                    right = mid - 1  # move backwards by 1
                else:
                    left = mid + 1  # move forward by 1

            else:  # rightmost side of the array     
                if nums[mid] <= target <= nums[right]: # if the target is in the right side of the array
                    left = mid + 1  # move forward by 1
                else:
                    right = mid - 1  # move backwards by 1
        return -1






