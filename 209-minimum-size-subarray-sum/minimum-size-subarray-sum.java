class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int left= 0;
        int right = 0;
        int sum =0;
        for(int i = right;i<nums.length;i++){
            sum+=nums[right];
            while(sum>=target){
                length = Math.min(length,right-left+1);

                sum = sum-nums[left];
                left++;
                
            }
             right++;

        }
        if(length==Integer.MAX_VALUE) return 0;
        else return length;
    }
}