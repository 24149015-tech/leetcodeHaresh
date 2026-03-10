// Last updated: 3/10/2026, 2:51:38 PM
import java.util.*;
class Solution{
    public int absDifference(int[]nums,int k){
        Arrays.sort(nums);
        int minSum=0;
        int maxSum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            minSum+=nums[i];
        }
        for(int i=n-k;i<n;i++){
            maxSum+=nums[i];
        }
        return Math.abs(maxSum-minSum);
    }
}