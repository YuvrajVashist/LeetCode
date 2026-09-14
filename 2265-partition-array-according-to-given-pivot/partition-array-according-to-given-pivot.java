class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == pivot){
                equal.add(nums[i]);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > pivot){
                greater.add(nums[i]);
            }
        }
        int length = less.size()+equal.size()+greater.size();
        int []res = new int[length];
        int index = 0;
        for(int i : less){
            res[index++] = i;
        }
        for(int i : equal){
            res[index++] = i;
        }
        for(int i : greater){
            res[index++] = i;
        }
        return res;
    }
}