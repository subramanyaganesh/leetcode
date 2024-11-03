class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        for(int i=2;i<cost.length;i++){
            cost[i]=Math.min(cost[i]+cost[i-1],cost[i]+cost[i-2]);
        }
        //System.out.println(Arrays.toString(cost));
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}

//[1,100,2,3,3,103,4,5,104,6]