class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[0].length; column++){
                if(grid[row][column] == '1'){
                    islands++;
                    bfs(grid, row, column);
                }
            }
        }
        return islands;
    }

    public void bfs(char[][] grid, int row, int column){
        if(grid[row][column] == '1'){
        grid[row][column] = '0';

        if(row < grid.length - 1){
        bfs(grid, row + 1, column);}
        if(column < grid[0].length - 1){
        bfs(grid, row, column + 1);}
        if(row > 0){
        bfs(grid, row - 1, column);}
        if(column > 0){
        bfs(grid, row, column - 1);}}
    }
}
