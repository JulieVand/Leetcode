/*

Given an integer x, return true if x is a palindrome, and false otherwise.

*/

class Solution {
    public boolean isPalindrome(int x) {
        String digitString = Integer.toString(x);
        String reverseString = "";
        for (int i = 0; i < digitString.length(); i++){
            reverseString = digitString.charAt(i) + reverseString;
        }
        if (digitString.equals(reverseString)){
            return true;
        } else {
            return false;
        }
    }
}
