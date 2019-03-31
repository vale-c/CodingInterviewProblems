/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

/* 
Runtime: 60 ms, faster than 95.70% of JavaScript online submissions for Search in Rotated Sorted Array.
Memory Usage: 33.8 MB, less than 46.85% of JavaScript online submissions for Search in Rotated Sorted Array.
 */

var search = function (nums, target) {
  if (nums.length === 0) return -1; // check if the array is empty

  let left = 0;
  let right = nums.length - 1;

  while (left <= right) {

    const mid = Math.floor((left + right) / 2); //set the mid value

    if (nums[mid] === target) {
      return mid;
    }

    //check left side of the array
    if (nums[left] <= nums[mid]) {
      if (nums[left] <= target && target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    else {
      //check right side of the array
      if (nums[mid] < target && target <= nums[right]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
  }
  return -1;

};