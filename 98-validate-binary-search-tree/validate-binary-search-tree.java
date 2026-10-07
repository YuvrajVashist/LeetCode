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
    boolean dfs(TreeNode root,long min_val,long max_val){
        if(root == null){
            return true;
        }
        if(root.val>=max_val || root.val<=min_val){
            return false;
        }
        return dfs(root.left,min_val,root.val) &&
        dfs(root.right,root.val,max_val);
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }
}