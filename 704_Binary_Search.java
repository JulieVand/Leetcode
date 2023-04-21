/*

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 

If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

*/

import java.lang.Math;

class Solution {
    public int search(int[] nums, int target) {
        int half = (nums.length/2);
        int start = 0;
        int end = nums.length;
        int index = (int)Math.sqrt(nums.length);
        for(int i = 0; i < (index + 1); i++){
            if (target < nums[half]){
                end = half;
                half = start + ((end - start)/2);
            } else if (target > nums[half]){
                start = half;
                half = half + ((end - start)/2) ;
            } else {
                return half;
            }
        }
        return -1;
    }
}
