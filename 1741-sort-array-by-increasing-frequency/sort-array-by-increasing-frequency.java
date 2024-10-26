class Solution {
    public int[] frequencySort(int[] nums) {
    Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.compute(n,(k,v)->v==null?1:v+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->{
            if(a.getValue()>b.getValue())return 1;
            else if(a.getValue()<b.getValue())return -1;
            else {
                if(a.getKey()<b.getKey())return 1;
                else return -1;
            }
        });

    pq.addAll(map.entrySet());
    int[] ans=new int[nums.length];
    int i=0;
    while(!pq.isEmpty()){
        Map.Entry<Integer,Integer> keys=pq.poll();
        for(int j=0;j<keys.getValue();j++)ans[i++]=keys.getKey();
    }
    return ans;
    }
}