// Last updated: 3/10/2026, 2:51:51 PM
class Solution {
    public int alternateDigitSum(int n) {
        String p = String.valueOf(n);
        int sum = 0;
        int index = 0;
        for(char ch : p.toCharArray()){
            int digit = ch - '0';
            if(index % 2 == 0){
                sum += digit;
                index++;
            }
            else{
                sum += -1 * digit;
                index++;
            }
        }
        return sum;
    }
}