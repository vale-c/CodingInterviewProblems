
/* 1.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

*/
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            
            int complement = target - nums[i]; 
        
            if (hmap.containsKey(complement)) {
                
                result[0] = hmap.get(complement);
                result[1] = i;
                
                return result;
            }
            
            hmap.put(nums[i], i);
        }
        return result;
    }
    
}