/*

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*/

class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        boolean found = false;
        if (haystack.equals(needle)){
                return 0;
        }
        if (haystack.contains(needle)){
            if (needle.length() == 1) {
                return haystack.indexOf(needle.charAt(0));
            }
            for (int i = 0; i < (haystack.length() - needle.length() + 1); i++){
                String subString = haystack.substring(i, (i + needle.length()));
                if (subString.equals(needle) && !found){
                    found = true;
                    return i;
                }
            }
        } 
        return index;
    }
}
