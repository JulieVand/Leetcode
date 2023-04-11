/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. 

If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

*/

import java.lang.Math;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = (int)Math.sqrt(nums.length);
        int half = nums.length/2;
        int start = 0;
        int end = nums.length;
        for (int i = 0; i < (index + 1); i++){
            if (target == nums[start]){
                return start;
            }
            if (target < nums[half]){
                end = half;
                half = start + ((end - start)/2);
            } else if (target > nums[half]){
                start = half;
                half = start + ((end - start))/2;
            } else {
                return half;
            }
        }
        if (target < nums[half]){
            return half;
        } 
        return (half + 1);
    }
}
