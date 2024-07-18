class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)return 0;
        int farthest=0;
        int end=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i+nums[i]>=nums.length-1){
                return ++count;
            }
            farthest=Math.max(farthest,i+nums[i]);
            if(i==end){
                end=farthest;
                count++;
            }
        }
        return count;
        
    }
}