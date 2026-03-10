// Last updated: 3/10/2026, 2:51:54 PM
class Solution {
    public int pivotInteger(int n) {
        int m=n*(n+1)/2;
        int x=(int) Math.sqrt(m);
        return x*x==m ? x: -1;

        
    }
}