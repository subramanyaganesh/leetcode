class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] visited=new boolean[isConnected.length];

        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
            
        }
        return count;
    }

    public void dfs(int node,int[][] isConnected,boolean[] visited){
        visited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]&&isConnected[node][i]==1){
                dfs(i,isConnected,visited);
            }
        }
    }
}