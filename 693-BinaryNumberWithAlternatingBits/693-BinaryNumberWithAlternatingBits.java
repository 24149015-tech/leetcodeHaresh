// Last updated: 3/10/2026, 2:52:16 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int x=(n^(n>>1));
        return(x&(x+1))==0 ?true : false;
    }
}