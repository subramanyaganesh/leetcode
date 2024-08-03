class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        boolean b=false;
        Arrays.sort(nums);
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(stack.isEmpty()||stack.peekLast()==nums[i]||stack.peekFirst()+1==nums[i]){
                stack.addLast(nums[i]);
                if(stack.peekFirst()+1==nums[i])b=true;
            }
            else {
                if(!b)stack.clear();
                max=Math.max(max,stack.size());
                b=false;
                while(!stack.isEmpty()&&stack.peekFirst()+1!=nums[i]){
                    stack.pollFirst();
                }
                stack.addLast(nums[i]);
            }
        }
        if(!b)stack.clear();
        max=Math.max(max,stack.size());
        return max;
    }
}