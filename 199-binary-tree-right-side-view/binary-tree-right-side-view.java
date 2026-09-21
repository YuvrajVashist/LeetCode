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
    void helper(TreeNode root,List<Integer> ans,int[]arr,int level){
        if(root == null){
            return;
        }
        if(arr[0]<level){
            ans.add(root.val);
            arr[0]++;
        }
        helper(root.right,ans,arr,level+1);
        helper(root.left,ans,arr,level+1);

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int []arr = new int[1];
        arr[0] = 0;
        helper(root,ans,arr,1);
        return ans;
    }
}