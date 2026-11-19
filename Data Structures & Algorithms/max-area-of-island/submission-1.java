class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[0].length; column++){
                if(grid[row][column] == 1){
                    area = Math.max(dfs(grid, row, column), area);
                }
            }
        }
        return area;
    }
    public int dfs(int[][] grid, int row, int column){
        if(row < 0 || column < 0 || row == grid.length || column == grid[0].length){
            return 0;
        }
        if(grid[row][column] == 1){
        grid[row][column] = 0;

        return
        dfs(grid, row + 1, column) +
        dfs(grid, row, column + 1) +
        dfs(grid, row - 1, column) +
        dfs(grid, row, column - 1) +
        1;}
        return 0;
    }
}
