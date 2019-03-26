/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  let singleVal = nums.reduce((a, b) => a ^ b);
  return singleVal;
};

