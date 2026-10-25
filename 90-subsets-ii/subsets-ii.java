class Solution {
    void rec(int[] nums, int index, List<Integer> list, HashSet<List<Integer>> ans) {
        //base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index>nums.length){
            return;
        }
        // if (index < nums.length) {
            list.add(nums[index]);
            rec(nums, index + 1, list, ans);
            list.remove(list.size()-1);
        // }
        rec(nums, index+1, list, ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> ans = new HashSet<>();
        int index = 0;
        rec(nums,index,list,ans);
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }
}