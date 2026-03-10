// Last updated: 3/10/2026, 2:52:10 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int a: position){
            if(a%2==0){
                even++;
            }
        }
        return Math.min(even, position.length-even);
        
    }
}