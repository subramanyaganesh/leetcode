class Solution {
    public static int[] NSER(int[] nums){
        Stack<Integer> stack=new Stack();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&& nums[i]<=nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=nums.length;
            }else ans[i]=stack.peek();

            stack.add(i);
        }
        return ans;
    }

    public static int[] NSEL(int[] nums){
        Stack<Integer> stack=new Stack();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&& nums[i]<=nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }else ans[i]=stack.peek();
            stack.add(i);
        }
        return ans;
    }
    public int maxSumMinProduct(int[] nums) {
        long[] ans=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ans[i+1]=ans[i]+nums[i];
        }
        int[] nser=NSER(nums);
        int[] nsel=NSEL(nums);
        long max=0;
        for(int i=0;i<nums.length;i++){
            long sum=ans[nser[i]]-ans[nsel[i]+1];
            long p=nums[i]*sum;
            max=Math.max(p,max);
        }
        int M=(int)(1e9+7);
        return (int)(max%M);
        
    }
}