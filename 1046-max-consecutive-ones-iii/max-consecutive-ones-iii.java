class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer> queue=new ArrayDeque<>();
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&count>=k){
                while(!queue.isEmpty() && queue.peek()!=0)queue.poll();
                 if(!queue.isEmpty()){
                    queue.poll();
                    count--;
                }
                
            } 
            if(nums[i]==0&&count<k){
                queue.add(nums[i]);
                count++;
            }else if(nums[i]==1)
                queue.add(nums[i]);
            
            
            max=Math.max(max,queue.size());
        }
        return max;
    }
}