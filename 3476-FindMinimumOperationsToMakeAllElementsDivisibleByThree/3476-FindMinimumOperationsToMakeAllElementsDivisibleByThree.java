// Last updated: 3/10/2026, 2:51:36 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int palani=0;
        for(int x:nums){
            if(x%3!=0){
                palani++;

            }
        }
        return palani;
    }
}