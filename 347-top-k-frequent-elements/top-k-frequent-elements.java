class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.compute(i,((l,v)->v==null?1:v+1));
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        int i=0;
        int[] ans=new int[k];
        while(k>0){
            ans[i++]=pq.poll().getKey();
            k--;
        }
        return ans;
    }
}