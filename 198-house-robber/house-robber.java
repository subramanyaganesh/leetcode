class Solution {
    public int rob(int[] nums) {
        if(nums.length>2){
            for(int i=2;i<nums.length;i++){
                int v=0;
                for(int j=0;j<i-1;j++){
                    v=Math.max(v,nums[i]+nums[j]);
                }
                nums[i]=v;
            }
        }
        return Arrays.stream(nums).max().orElse(0);
    }
}