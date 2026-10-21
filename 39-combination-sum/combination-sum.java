class Solution {
    void res(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> list) {
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (target >= candidates[index]) {
            list.add(candidates[index]);
            res(candidates, target - candidates[index], index, ans, list);
            
            list.remove(list.size()-1);
        }
        res(candidates, target, index + 1, ans, list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        res(candidates, target, index, ans, list);
        return ans;
    }
}