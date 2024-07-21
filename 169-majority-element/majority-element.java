class Solution {
    public int majorityElement(int[] nums) {


        int len=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.compute(nums[i],(k,v)->v==null?1:v+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>len)return entry.getKey();
        }
        return 0;
    }
}