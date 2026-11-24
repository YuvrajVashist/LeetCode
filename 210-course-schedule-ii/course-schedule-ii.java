class Solution {
    boolean iscycle(int i, boolean[] visited, boolean[] rec, int[][] prerequisites) {
        visited[i] = true;
        rec[i] = true;

        for (int j = 0; j < prerequisites.length; j++) {
            int u = prerequisites[j][1];
            int v = prerequisites[j][0];
            if (u == i) {
                if (!visited[v]) {
                    if (iscycle(v, visited, rec, prerequisites)) {
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

    void topsort(int i,boolean[] visited2, Stack<Integer>s,int[][] prerequisites,int[] ans){
        visited2[i] = true;
        for(int j = 0;j<prerequisites.length;j++){
            int u = prerequisites[j][1];
            int v = prerequisites[j][0];

            if(u == i){
                if(!visited2[v]){
                    topsort(v,visited2,s,prerequisites,ans);
                }
            }
        }
        s.push(i);
        
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int v = prerequisites.length;
        int[] ans = new int[numCourses];
        int index = 0;
        //DAG
        //1. Cycle Detection
        //2. Topological Sort

        boolean[] visited = new boolean[numCourses];
        boolean[] visited2 = new boolean[numCourses];

        boolean[] rec = new boolean[numCourses];
        Stack<Integer> s = new Stack<>();

      
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (iscycle(i, visited, rec, prerequisites)) {
                    return new int[0];
                } else {
                    topsort(i, visited2, s, prerequisites, ans);
                }
            }
        }

        while(!s.isEmpty()){
            ans[index++] = s.peek();
            s.pop();
        }
        return ans;
    }
}