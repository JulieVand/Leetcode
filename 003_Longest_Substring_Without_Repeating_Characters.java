
/*

Given a string s, find the length of the longest substring without repeating characters.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++){
            if ((subString.indexOf(s.charAt(i)) == -1)){ 
                subString += Character.toString(s.charAt(i));
                if (subString.length() > maxLength){
                    maxLength = subString.length();
                } 
            } else {
                i = i - subString.length();
                if (subString.length() > maxLength){
                    maxLength = subString.length();
                }
                subString = "";
            }
        }
        return maxLength;
    }
}
