/*

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int one = 0;
        int two = 0;
        for (int i = 0; i < merged.length; i++){
            if (nums1.length == one){
                merged[i] = nums2[two];
                two++;
            } else if (nums2.length == two){
                merged[i] = nums1[one];
                one++;
            } else {
                if (nums2[two] > nums1[one]){
                    merged[i] = nums1[one];
                    one++;
                } else if (nums2[two] < nums1[one]){
                    merged[i] = nums2[two];
                    two++;
                } else {
                    merged[i] = nums1[one];
                    merged[i + 1] = nums2[two];
                    one++;
                    two++;
                    i++;
                }
            }
        }
        double median = 0;
        if ((merged.length % 2) == 0){
            median = (double)(merged[(merged.length/2) - 1] + merged[merged.length/2])/2;
        } else {
            median = merged[merged.length/2];
        }
        return median;
    }
}
