class Solution {
    void rec(int n,int k,int index,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index;i<=n;i++){
            list.add(i);
            rec(n,k,i+1,list,ans);
            //backtrack
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 1;
        rec(n,k,index,list,ans);
        return ans;
    }
}