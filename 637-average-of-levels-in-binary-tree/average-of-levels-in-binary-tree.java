class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            double sum = 0;

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();

                sum += curr.val;

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            double avg = sum / n;
            ans.add(avg);
        }

        return ans;
    }
}