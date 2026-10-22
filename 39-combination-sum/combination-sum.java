class Solution {
    void fn(int[] candidates,int index,int target,List<Integer>list,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(index == candidates.length){
            return;
        }

        if(candidates[index]<=target){
            list.add(candidates[index]);
            //recursion call
            fn(candidates,index,target-candidates[index],list,ans);
            list.remove(list.size()-1);
        }
        fn(candidates,index+1,target,list,ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0; 

        fn(candidates,index,target,list,ans);
        // Collections.sort(ans);
        List<List<Integer>> result = new ArrayList<>(ans);
        return result;
    }
}