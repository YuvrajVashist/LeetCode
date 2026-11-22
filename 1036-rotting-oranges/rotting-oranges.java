class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;
        boolean[][] visited = new boolean[rows][cols];
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    list.add(0);
                    q.add(list);
                    visited[i][j] = true;
                }
            }
        }
        while (!q.isEmpty()) {
            ArrayList<Integer> list = q.poll();
            int i = list.get(0);
            int j = list.get(1);
            int time = list.get(2);
            ans = Math.max(ans, time);
            //top
            if (i - 1 >= 0 && !visited[i-1][j] && grid[i - 1][j] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i - 1);
                temp.add(j);
                temp.add(time + 1);
                q.add(temp);
                visited[i - 1][j] = true;
                // grid[i-1][j] = 2;
            }
            //bottom
            if (i + 1<rows && !visited[i+1][j] && grid[i + 1][j] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(i + 1);
                temp.add(j);
                temp.add(time + 1);
                q.add(temp);
                visited[i + 1][j] = true;
                // grid[i+1][j] = 2;
            }
            //left
            if (j - 1 >= 0 && !visited[i][j-1] && grid[i][j - 1] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(i);
                temp.add(j - 1);
                temp.add(time + 1);
                q.add(temp);
                visited[i][j - 1] = true;
                // grid[i][j-1] = 2;
            }

            //rigth
            if (j + 1 <cols && !visited[i][j+1] && grid[i][j + 1] == 1) {
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(i);
                temp.add(j + 1);
                temp.add(time + 1);
                q.add(temp);
                visited[i][j + 1] = true;
                // grid[i][j+1] = 2;
            }
        }

        //check fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    return -1;
                }
            }
        }
        return ans;
    }
}