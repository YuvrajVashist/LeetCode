class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int prefixSum = start;
        int ans = 0;
        for(int i = 0;i<gain.length;i++){
            prefixSum+=gain[i];
            ans = Math.max(ans,prefixSum);
        }
        return ans;
        
    }
}