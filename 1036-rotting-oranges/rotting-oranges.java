class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<ArrayList<Integer>> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    ArrayList<Integer> list = new ArrayList<>();
                    visited[i][j] = true;
                    list.add(i);
                    list.add(j);
                    list.add(0);
                    q.add(list);
                }
            }
        }
        while (!q.isEmpty()) {
            ArrayList<Integer> curr = q.poll();
            int i = curr.get(0);
            int j = curr.get(1);
            int time = curr.get(2);
            minutes = Math.max(minutes, time);
            //top
            if (i - 1 >= 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                visited[i - 1][j] = true;
                temp.add(i - 1);
                temp.add(j);
                temp.add(time + 1);
                q.add(temp);

            }
            //bottom
            if (i + 1 < n && !visited[i + 1][j] && grid[i + 1][j] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                visited[i + 1][j] = true;
                temp.add(i + 1);
                temp.add(j);
                temp.add(time + 1);
                q.add(temp);
            }
            //left 
            if (j - 1 >= 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                visited[i][j - 1] = true;
                temp.add(i);
                temp.add(j - 1);
                temp.add(time + 1);
                q.add(temp);

            }
            // right
            if (j + 1 < m && !visited[i][j + 1] && grid[i][j + 1] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                visited[i][j + 1] = true;
                temp.add(i);
                temp.add(j + 1);
                temp.add(time + 1);
                q.add(temp);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    return -1;
                }
            }
        }
        return minutes;
    }
}