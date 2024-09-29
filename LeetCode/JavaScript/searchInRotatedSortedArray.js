/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
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

/**
 * Time Complexity: O(log n) - The algorithm uses binary search, which divides the search space in half each iteration.
 * Space Complexity: O(1) - The algorithm uses a constant amount of space for variables.
 */
