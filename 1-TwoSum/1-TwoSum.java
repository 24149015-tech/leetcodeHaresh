// Last updated: 3/10/2026, 2:52:43 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int x = target - nums[i];
            if (numMap.containsKey(x)) {
                return new int[]{i,numMap.get(x)};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
