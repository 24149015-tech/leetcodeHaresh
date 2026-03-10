// Last updated: 3/10/2026, 2:51:52 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        return Math.abs(sumElements(nums) - sumDigits(nums));
    }
    int sumElements(int[] arr){
        int sum = 0;
        for(int e : arr){
            sum += e;
        }
        return sum;
    }
    int sumDigits(int[] arr){
        int sum = 0;
        for(int e : arr){
            while(e > 0){
                sum+= e%10;
                e = e/10;
            }
        }
        return sum;
    }
}