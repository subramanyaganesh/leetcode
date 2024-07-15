class Solution {
    public int maxSubArray(int[] nums) {
        int sequence=nums[0];
        int max=nums[0];
        int start=0;
        int end=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]+sequence>nums[i]){
                sequence+=nums[i];
            }else{
                sequence=nums[i];
                start=i;
            }
            if(sequence>max){
                max=sequence;
                end=i;
            }
            
            
        }
         int[] mm=Arrays.copyOfRange(nums,start,end+1<start?start:end+1);
        for(int i:mm)System.out.print(i+"\t");
        return Math.max(max,sequence);
    }
}