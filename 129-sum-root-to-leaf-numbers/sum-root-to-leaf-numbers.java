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
    int dfs(TreeNode root,int sum){
        if(root == null){
            return 0;
        }
        sum = sum*10+root.val;
        //how do i know that i reach the leaf
        if(root.left==null && root.right == null){
            return sum;
        }
        
        int left = dfs(root.left,sum);
        int right = dfs(root.right,sum);
        return left+right;

    }
    public int sumNumbers(TreeNode root) {
        int sum  = 0;
        
        if(root == null){
            return 0;
        }
        return dfs(root,sum);
    }
}