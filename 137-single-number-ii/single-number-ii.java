class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> stack=new ArrayList<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                stack.add(i);
                map.put(i,1);
            }else{
                if(stack.contains(i))stack.remove((Object)i);
            }
            
        }
        return stack.get(0);


        
    }
}