// Last updated: 3/24/2026, 9:38:30 AM
1class Solution {
2    public int removeDuplicates(int[] arr) {
3        int i=0;
4        for(int j=1;j<arr.length;j++){
5            if(arr[i]!=arr[j]){
6                i++;
7                arr[i]=arr[j];
8            }
9        }
10        return i+1;        
11    }
12}