/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void helper(List<Integer> ans,Queue<TreeNode> q,TreeNode root,int level,int[]arr){
        if(root == null){
            return;
        }
        if(level>arr[0]){
            ans.add(root.val);
            arr[0]++;
        }
        helper(ans,q,root.right,level+1,arr);
        helper(ans,q,root.left,level+1,arr);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        int []arr = new int[1];
        arr[0] = 0;
        helper(ans,q,root,1,arr);
        return ans;

    }
}