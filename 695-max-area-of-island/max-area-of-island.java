class Solution {


    public void dfs(int[][] visited,int[][] grid,int a,int b,List<Integer> list){

        visited[a][b]=1;

        for(int i=a+1;i<grid.length;i++){
            if(visited[i][b]==0&&grid[i][b]==1){
                list.add(1);
                dfs(visited,grid,i,b,list);
            }
            else {
                visited[i][b]=1;
                break;
            }
        }
        for(int i=a-1;i>=0;i--){
            if(visited[i][b]==0&&grid[i][b]==1){
                list.add(1);
                dfs(visited,grid,i,b,list);
            }
            else {
                visited[i][b]=1;
                break;
            }
        }

        for(int j=b+1;j<grid[0].length;j++){
            if(visited[a][j]==0&&grid[a][j]==1){
                list.add(1);
                dfs(visited,grid,a,j,list);
            }
            else{
                visited[a][j]=1;
                break;
            }
        }

        for(int j=b-1;j>=0;j--){
            if(visited[a][j]==0&&grid[a][j]==1){
                list.add(1);
                dfs(visited,grid,a,j,list);
            }
            else {
                visited[a][j]=1;
                break;
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {

        int[][] visited=new int[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                List<Integer> list=new ArrayList<>();
                if(visited[i][j]==0&&grid[i][j]==1){
                    list.add(1);
                    dfs(visited,grid,i,j,list);
                    max=Math.max(max,list.size());
                }else if(visited[i][j]==0&&grid[i][j]==0){
                    visited[i][j]=1;
                }
            }
        }
        return max;
    }
}

