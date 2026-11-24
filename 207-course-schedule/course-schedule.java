class Solution {
    boolean dfs(int i, boolean[] visited, boolean[] rec, int[][] prerequisites) {
        visited[i] = true;
        rec[i] = true;
        for (int j = 0; j < prerequisites.length; j++) {
            int u = prerequisites[j][1];
            int v = prerequisites[j][0];

            if (u == i) {
                if (!visited[v]) {
                    if (dfs(v, visited, rec, prerequisites)) {
                        return true;
                    }
                } else if (rec[v]) {
                    return true;
                }
            }

        }
        rec[i] = false;
        return false;

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //cycle detection
        boolean[] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, rec, prerequisites)) {
                    return false;
                }
            }
        }
        return true;
    }
}