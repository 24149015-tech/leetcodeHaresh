// Last updated: 3/10/2026, 2:52:37 PM
class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0;
        for(int num:nums){
            if(num==0)zero++;
            if(num==1)one++;
        }
        int index=0;
        while(zero-->0)nums[index++]=0;
        while(one-->0)nums[index++]=1;
        while(index<nums.length)nums[index++]=2;
    }
}