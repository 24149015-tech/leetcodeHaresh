// Last updated: 3/10/2026, 2:52:14 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int x : nums) {
            if (!set.add(x)) return x;
        }
        return -1;
    }
}