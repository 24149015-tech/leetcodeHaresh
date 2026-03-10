// Last updated: 3/10/2026, 2:52:22 PM
class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        StringBuilder str = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15; // same like num / 16
            str.append(hexChars[rem]); 
            num >>>= 4;         // same like num % 16
        }

        return str.reverse().toString(); 
    }

}