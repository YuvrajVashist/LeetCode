class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minval = 0;
        for(int i = 0;i<nums.length;i++){
            sum= sum+nums[i];
            minval = Integer.min(minval,sum);
        }
        return  1 - minval;
        
    }

    // kisi bhi number ko 1 bnane k lie kitna add krna hoga us number me
}