// Last updated: 3/10/2026, 2:52:15 PM
import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int[] seen = new int[101];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            int smallest = Integer.MAX_VALUE;
            for (int j = temperatures[i] + 1; j < 101; j++) {
                if (seen[j] != 0) {
                    smallest = Math.min(smallest, seen[j]);
                }
            }
            if (smallest != Integer.MAX_VALUE) ans[i] = smallest - i;
            seen[temperatures[i]] = i;
            
        }

        return ans;
    }
}