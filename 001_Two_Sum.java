/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] foundIndices = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if ((i != j) && ((nums[i] + nums[j]) == target)){
                    foundIndices[0] = i;
                    foundIndices[1] = j;
                    i = nums.length;
                    j = nums.length;
                }
            }
        }
        return foundIndices;
    } 
}
