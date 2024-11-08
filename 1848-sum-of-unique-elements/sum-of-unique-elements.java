class Solution {
    public int sumOfUnique(int[] nums) {
        int[] ans=new int[101];
        for(int i:nums){
            ans[i]++;
        }
        int sum=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]==1)sum+=i;
        }
        return sum;
    }
}