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

    boolean dfs(TreeNode root,int targetSum,int sum){
        if(root == null){
            return false;
        }
        sum = sum+root.val;
        if(root.left == null && root.right==null){
            return targetSum == sum;
        }
       return dfs(root.left,targetSum,sum)||dfs(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int sum = 0;
        return dfs(root,targetSum,sum);
        
    }
}