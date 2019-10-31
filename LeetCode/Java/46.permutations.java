/* 46. Permutations

Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (nums == null || nums.length == 0)
            return res;
        
        boolean[] used = new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        helper(nums,permutation,used,res);
        return res;
    }
    
    private void helper(int[] nums, List<Integer> permutation, boolean[] used, List<List<Integer>> res){ 
        if(permutation.size () == nums.length) {
            res.add(new ArrayList<>(permutation)); //deep copy
            return;
        }
    for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue; //skip if already seen this num
            used[i] = true;
            permutation.add(nums[i]);
            helper(nums, permutation, used, res);
            permutation.remove(permutation.size()-1);
            used[i] = false;
        }
    }
}