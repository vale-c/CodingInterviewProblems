/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  let singleVal = nums.reduce((a, b) => a ^ b);
  return singleVal;
};

/**
 * Time Complexity: O(n) - We traverse the array once.
 * Space Complexity: O(1) - We use a constant amount of space.
 */
