class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        int count=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum>k){
                j--;
            }else if(sum<k){
                i++;
            }else{
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}