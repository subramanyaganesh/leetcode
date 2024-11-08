class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)map.compute(i,(k,v)->v==null?1:v+1);
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)sum+=entry.getKey();
        }
        return sum;
    }
}