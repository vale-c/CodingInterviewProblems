/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function (nums) {

  let max = nums[0];
  let i = 0;

  while (i < nums.length && max >= i) {
    if (nums[i] + i > max) {
      max = nums[i] + i;
    }
    i++;
  }

  return max >= nums.length - 1;  //it returns true if you can reach the last element


};