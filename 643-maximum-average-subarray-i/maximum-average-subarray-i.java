class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double sum=0;
        double ans=Integer.MIN_VALUE;

        while(i<nums.length){
            if(i<k)sum+=nums[i];
            else{
                sum-=nums[j++];
                sum+=nums[i];
            }
            i++;
            if(i-j==k){
                ans=Math.max(ans,(double)sum/k);
            }
            
        }
        return ans;
        
    }
}