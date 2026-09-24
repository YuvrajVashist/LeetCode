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
    void dfs(TreeNode root, List<String> str, String s) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            str.add(s);
            return;
        }
        
        if (root.left != null) {
            dfs(root.left, str, s+"->"+Integer.toString(root.left.val));
        }
        if (root.right != null) {
            dfs(root.right, str, s+"->"+Integer.toString(root.right.val));
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str = new ArrayList<>();
        if (root == null) {
            return str;
        }
        String s = Integer.toString(root.val);
        dfs(root, str, s);
        return str;
    }
}