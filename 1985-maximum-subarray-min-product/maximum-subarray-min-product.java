class Solution {

    public int[] NSEL(int[] nums){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&& nums[stack.peek()]>=nums[i])stack.pop();

            if(stack.isEmpty()){
                ans[i]=-1;
            }else ans[i]=stack.peek();
            stack.add(i);
        }
        return ans;
    }

    public int[] NSER(int[] nums){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&& nums[stack.peek()]>=nums[i])stack.pop();

            if(stack.isEmpty()){
                ans[i]=nums.length;
            }else ans[i]=stack.peek();
            stack.add(i);
        }
        return ans;
    }

    public int maxSumMinProduct(int[] nums) {
        long[] prefix=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        int[] nsel=NSEL(nums);
        int[] nser=NSER(nums);

        long max=0;
        for(int i=0;i<nums.length;i++){
            int r=nser[i];
            int l=nsel[i];
            long sum=prefix[r]-prefix[l+1];
            long prod=sum*nums[i];
            max=Math.max(max,prod);
        }
        int M=(int)(1e9+7);
        return (int)(max%M);
        
    }
}