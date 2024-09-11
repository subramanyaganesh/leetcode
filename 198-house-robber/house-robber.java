class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];

        for(int i=2;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<i-1;j++){
               temp=Math.max(nums[i]+nums[j],temp);
            }
            nums[i]=temp;
        }
        //System.out.println(Arrays.toString(nums));
        return Math.max(nums[nums.length-1],nums[nums.length-2]);
        
    }
}