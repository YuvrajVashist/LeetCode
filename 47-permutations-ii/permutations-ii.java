class Solution {
    void rec(int[]nums,List<Integer> list,boolean[]mp,HashSet<List<Integer>> ans){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!mp[i]){
                list.add(nums[i]);
                mp[i]=true;
                rec(nums,list,mp,ans);
                //backtrack;
                list.remove(list.size()-1);
                mp[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[]mp = new boolean[nums.length];
        rec(nums,list,mp,ans);
        List<List<Integer>> res = new ArrayList<>(ans);
        return res;
    }
}