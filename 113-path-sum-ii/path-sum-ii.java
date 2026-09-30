class Solution {

    void dfs(TreeNode root, int targetSum, List<Integer> list,
             List<List<Integer>> ans, int sum) {

        if (root == null) {
            return;
        }

        sum = sum + root.val;
        list.add(root.val);

        if (root.left == null && root.right == null) {

            if (targetSum == sum) {
                ans.add(new ArrayList<>(list));
            }

            list.remove(list.size() - 1);
            return;
        }

        dfs(root.left, targetSum, list, ans, sum);
        dfs(root.right, targetSum, list, ans, sum);

        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        dfs(root, targetSum, list, ans, 0);

        return ans;
    }
}