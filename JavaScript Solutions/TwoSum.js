/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    let indicesTarget = [];
    
    for (let i = 0; i <= nums.length; i++) {
      for(let j = 0; j < i; j++) {
          if (nums[i] + nums[j] == target) {
              
            indicesTarget.push(nums[i]);
            indicesTarget.push(nums[j]);        
            
                                    
            let result = indicesTarget.map((v, i) => v == -1 ? -1 : i);     
          
            return result;
                                          
        }
          else {
              return null;
          }
      }
    }
};