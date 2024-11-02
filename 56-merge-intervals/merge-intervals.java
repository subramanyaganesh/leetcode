class Solution {
    public int[][] merge(int[][] intervals) {
       Stack<Integer> stack=new Stack<>();
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       stack.push(intervals[0][0]);
       stack.push(intervals[0][1]);

       for(int i=1;i<intervals.length;i++){
        if(stack.peek()<intervals[i][0]){
            stack.add(intervals[i][0]);
            stack.add(intervals[i][1]);
        }else if(stack.peek()<intervals[i][1]){
            stack.pop();
            stack.push(intervals[i][1]);
        }
       }
       int[][] ans=new int[stack.size()/2][2];
       int j=stack.size()/2-1;
       while(!stack.isEmpty()){
        ans[j][1]=stack.pop();
        ans[j--][0]=stack.pop();
       }
       return ans;
    }
}