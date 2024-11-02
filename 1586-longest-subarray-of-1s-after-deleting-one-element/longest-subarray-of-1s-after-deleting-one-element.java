class Solution {
    public int longestSubarray(int[] nums) {


        int i=0;
        int j=0;
        int k=0;
        boolean used=false;
        
        int max=0;
        while(i<nums.length){
            if(used&&nums[i]==0){
                k=i;
                while(j<i && nums[j]!=0)j++;
                j++;
            }
            
            if(nums[i]==0)used=true;
            else k++;
            max=Math.max(max,k-j);
            i++;
        }
        return used?max:max-1;
    }
}