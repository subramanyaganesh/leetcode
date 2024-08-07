class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(j==0)perimeter++;
                    else if(grid[i][j-1]==0)perimeter++;
                    if(j==m-1)perimeter++;
                    else if(grid[i][j+1]==0)perimeter++;
                    if(i==0)perimeter++;
                    else if(grid[i-1][j]==0)perimeter++;
                    if(i==n-1)perimeter++;
                    else if(grid[i+1][j]==0)perimeter++;
                }
            }
        }
        return perimeter;
    }
}