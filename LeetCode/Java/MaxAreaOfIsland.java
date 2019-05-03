class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j <grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    max = Math.max(max, DFS(grid, i , j));
               }   
            }
        }
        return max;
    }
    
    public int DFS(int[][] grid, int i, int j) {
    if (i<0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j]!=1)
         return 0;
        
        int count = 1;
        
        grid[i][j] = 0;

        //Execute DFS Routine
        count+= DFS(grid, i-1, j); //up
        count+= DFS(grid, i+1, j); //down
        count+= DFS(grid, i, j-1); //left
        count+= DFS(grid, i, j+1); //right
        
        return count;
           
    }
}