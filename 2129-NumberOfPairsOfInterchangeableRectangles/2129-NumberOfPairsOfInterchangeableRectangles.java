// Last updated: 3/10/2026, 2:52:03 PM
class Solution {
    public long interchangeableRectangles(int[][] rect) {
        long n = rect.length,res=0;
        Map<Double,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double ratio = (double) rect[i][0] / rect[i][1];
            res = res + hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return res;
    }
}