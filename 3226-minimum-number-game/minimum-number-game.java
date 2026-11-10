class Solution {
    public int[] numberGame(int[] nums) {
        int []ans = new int[nums.length];
        int index = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<nums.length;i++){
            heap.add(nums[i]);
        }
        while(!heap.isEmpty()){
            int alice = heap.peek();
            heap.remove();
            int bob = heap.peek();
            heap.remove();
            ans[index++]=bob;
            ans[index++]=alice;
        }
        return ans;
    }
}