// Last updated: 3/10/2026, 2:52:28 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else if (num%9 != 0) return num%9;
        else return 9;
        
    }
}