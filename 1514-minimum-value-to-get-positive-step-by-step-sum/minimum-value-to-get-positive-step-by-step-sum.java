class Solution {
    public int minStartValue(int[] nums) {
        int startval = 1;
        while(true){
            boolean valid = true;
            int prefixSum = startval;
            for(int i = 0;i<nums.length;i++){
                prefixSum = prefixSum+nums[i];
                if(prefixSum<1){
                    valid = false;
                    break;
                }

            }
            if(valid){
                return startval;
            }
            startval++;
        }
        
    }
}