class Solution {
    void dfs(int i, int j, int rows, int cols, boolean[][] visited, char[][] grid) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] ||grid[i][j]!='1') {
            return;
        }
        visited[i][j] = true;
        
        //right
        dfs(i, j + 1, rows, cols, visited, grid);
        //left
        dfs(i, j - 1, rows, cols, visited, grid);
        //up
        dfs(i - 1, j, rows, cols, visited, grid);
        //down
        dfs(i + 1, j, rows, cols, visited, grid);
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[rows][cols];
        // int i = 0;
        // int j = 0;

        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < cols; l++) {
                if (grid[k][l] == '1' && !visited[k][l]) {
                    dfs(k, l, rows, cols, visited, grid);
                    islands++;
                }
            }
        }
        return islands;
    }
}