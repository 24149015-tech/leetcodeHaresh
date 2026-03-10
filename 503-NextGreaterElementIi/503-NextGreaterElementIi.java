// Last updated: 3/10/2026, 2:52:17 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=-1;
            for(int j=1;j<n;j++){
                if( nums[i] < nums[(i+j)%n] ){
                    arr[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return arr;
    }
}