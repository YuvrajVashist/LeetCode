class Solution {
    void rec(int n,int open,int close , StringBuilder s,List<String> ans){
        if(s.length()==2*n){
            ans.add(s.toString());
            return;
        }
        if(open<n){
            s.append('(');
            rec(n,open+1,close,s,ans);
            s.deleteCharAt(s.length()-1);

        }
        if(open>close){
            s.append(')');
            rec(n,open,close+1,s,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        List<String> ans = new ArrayList<>();
        int open = 0;
        int close = 0;
        rec(n,open,close,s,ans);
        return ans;
    }
}