class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[0].length; column++){
                if(grid[row][column] == '1'){
                    islands++;
                    dfs(grid, row, column);
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid, int row, int column){
        if(row < 0 || column < 0 || row == grid.length || column == grid[0].length){
            return;
        }
        if(grid[row][column] == '1'){
        grid[row][column] = '0';
        
        dfs(grid, row + 1, column);
        dfs(grid, row, column + 1);
        dfs(grid, row - 1, column);
        dfs(grid, row, column - 1);}
    }
}
