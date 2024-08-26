class Solution {
    public int[] frequencySort(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.compute(i,(k,v)->v==null?1:v+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->{
            if(b.getValue()!=a.getValue()){
                return a.getValue()-b.getValue();
            }else{
                return b.getKey()-a.getKey();
            }
        });

        pq.addAll(map.entrySet());
        int[] ans=new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry=pq.poll();
            for(int i=0;i<entry.getValue();i++){
                ans[j++]=entry.getKey();
            }
        }
        return ans;
    }
}