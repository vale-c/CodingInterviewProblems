/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numMap = new Map(); // Create a map to store numbers and their indices

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i]; // Calculate the complement
        if (numMap.has(complement)) {
            return [i, numMap.get(complement)]; // Return indices if complement is found
        }
        numMap.set(nums[i], i); // Store the number and its index
    }
    return null; // Return null if no solution found
};

/**
 * Time Complexity: O(n) - We traverse the list once.
 * Space Complexity: O(n) - We store elements in the map.
 */