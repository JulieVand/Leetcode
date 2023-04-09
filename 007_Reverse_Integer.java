/*

Given a signed 32-bit integer x, return x with its digits reversed. 

If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

*/

class Solution {
    public int reverse(int x) {
        String numberStr = Integer.toString(x);
        boolean negative = false;
        if (numberStr.charAt(0) == '-'){
            negative = true;
            numberStr = numberStr.substring(1,numberStr.length());
        }
        String newStr = "";
        for (int i = 0; i < numberStr.length(); i++){
            newStr = numberStr.charAt(i) + newStr;
        }
        int num;
        try {
            num = Integer.parseInt(newStr);
        } catch (Exception e){
            num = 0;
        }
        if (negative){
            num = num * -1;
        }
        return num;
    }
}
  
 
