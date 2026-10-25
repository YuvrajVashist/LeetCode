class Solution {
    void rec(int[] nums, boolean[] map, List<Integer> list, List<List<Integer>> ans) {
        //base case
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!map[i]) {
                list.add(nums[i]);
                map[i] = true;
                rec(nums, map, list, ans);
                //backtrack
                list.remove(list.size() - 1);
                map[i] = false;

            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        rec(nums, map, list, ans);
        return ans;
    }
}