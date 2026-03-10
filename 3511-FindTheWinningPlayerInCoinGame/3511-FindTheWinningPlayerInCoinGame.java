// Last updated: 3/10/2026, 2:51:40 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int t=Math.min(x,y/4);
        if(t%2==0){
            return "Bob";
            
        }else{
            return "Alice";
        }
        
    }
}