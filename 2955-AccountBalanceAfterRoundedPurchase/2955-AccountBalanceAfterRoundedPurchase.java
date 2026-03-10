// Last updated: 3/10/2026, 2:51:43 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10>4)
            purchaseAmount+=10-purchaseAmount%10;
        else
            purchaseAmount-=purchaseAmount%10;
        return 100-purchaseAmount;    
        
        
    }
}