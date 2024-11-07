class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<nums.length/2;j++){
                list.add(j%2==0?Math.min(nums[2*j],nums[2*j+1]):Math.max(nums[2*j],nums[2*j+1]));
            }
            nums=list.stream().mapToInt(a->a).toArray();
        }
        return nums[0];
    }
}