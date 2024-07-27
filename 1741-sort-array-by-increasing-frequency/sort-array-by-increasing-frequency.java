class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)map.compute(i,(k,v)->v==null?1:v+1);
        List<Integer> answer=new ArrayList<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->{
            int val=Integer.compare(a.getValue(),b.getValue());
            if(val==0){
                return Integer.compare(b.getKey(),a.getKey());
            }else return val;
        });
        pq.addAll(map.entrySet());
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry=pq.poll();
            int m=entry.getValue();
            while(m!=0){
                answer.add(entry.getKey());
                m--;
            }
        }
        return answer.stream().mapToInt(a->a).toArray();
    }
}