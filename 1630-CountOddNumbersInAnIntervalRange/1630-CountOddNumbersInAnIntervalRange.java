// Last updated: 3/10/2026, 2:52:07 PM
class Solution {
    public int countOdds(int low, int high) {
        int nums=high-low+1;
        if(low%2!=0 && high%2!=0){
            return nums/2+1;
        }
        else{
            return nums/2;
        }


        
    }
}