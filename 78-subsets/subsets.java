class Solution {
    void rec(int[] nums,int index, List<Integer> list, List<List<Integer>>ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index<nums.length){
            list.add(nums[index]);
            rec(nums,index+1,list,ans);
            list.remove(list.size()-1);
        }
        rec(nums,index+1,list,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        rec(nums,index,list,ans);
        return ans;
    }
}