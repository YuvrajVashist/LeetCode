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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null)
            return ans;
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (flag == false) {
                    ans.add(temp.val);
                    flag = true;
                }
                if (temp.right != null)
                    q.offer(temp.right);
                if (temp.left != null)
                    q.offer(temp.left);
            }

        }
        return ans;
    }
}