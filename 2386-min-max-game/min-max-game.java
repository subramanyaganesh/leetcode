class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            int[] list=new int[nums.length/2];
            for(int j=0;j<nums.length/2;j++){
                list[j]=j%2==0?Math.min(nums[2*j],nums[2*j+1]):Math.max(nums[2*j],nums[2*j+1]);
            }
            nums=list;
        }
        return nums[0];
    }
}