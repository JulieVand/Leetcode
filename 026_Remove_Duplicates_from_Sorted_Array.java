/*

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 

The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 

The remaining elements of nums are not important as well as the size of nums.

Return k.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] newNums = new int[nums.length]; 
        int j = 1;
        newNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (newNums[j - 1] < nums[i]){
                newNums[j] = nums[i];
                j++;
            }

        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = newNums[i];
        }
        int k = j;
        return k;
    }
}
