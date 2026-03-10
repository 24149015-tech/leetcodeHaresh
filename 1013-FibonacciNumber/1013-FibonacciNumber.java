// Last updated: 3/10/2026, 2:52:13 PM
class Solution {
   public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int first = 0;
            int second = 1;
            for (int i = 2; i <= n; i++) {
                int next = first + second;
                first = second;
                second = next;
            }
            return second;
        }
    }
}