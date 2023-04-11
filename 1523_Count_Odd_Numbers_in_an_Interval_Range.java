/*

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

*/

class Solution {
    public int countOdds(int low, int high) {
        int difference = high - low;
        if (((low % 2) == 0) && ((high % 2) == 0)){
            return (difference/2);
        } else {
            return ((difference/2) + 1);
        }
    }
}
