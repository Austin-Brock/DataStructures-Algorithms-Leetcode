//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

/* Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

class solution {
    public int[] twoSum(int[] nums, int target) {
        //loop through each element in the array
        for(int i = 0; i < nums.length; i++) {
            //loopthrough each element staring from the next index of i
            for(int j = 0; i < nums.length; j++) {
                //check if the sum of nums[i] and nums[j] equals the target
                if(nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }//if
            }//jfor
        }//ifor
    }//twoSum
    //if pair is not found return null
    return null;
}//solution