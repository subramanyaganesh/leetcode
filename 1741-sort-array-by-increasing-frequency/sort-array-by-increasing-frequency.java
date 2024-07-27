class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)map.compute(i,(k,v)->v==null?1:v+1);

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        pq.addAll(map.entrySet());
        List<Integer> answer=new ArrayList<>();
        PriorityQueue<Map.Entry<Integer,Integer>> fq=new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry=pq.poll();
            if(!fq.isEmpty()&&entry.getValue()!=fq.peek().getValue()){
                while(!fq.isEmpty()){
                    Map.Entry<Integer,Integer> e=fq.poll();
                    int m=e.getValue();
                    while(m!=0){
                        answer.add(e.getKey());
                        m--;
                    }
                }
            }
            fq.add(entry);
        }
        while(!fq.isEmpty()){
                Map.Entry<Integer,Integer> e=fq.poll();
                int m=e.getValue();
                while(m!=0){
                    answer.add(e.getKey());
                    m--;
                }
        }
        return answer.stream().mapToInt(a->a).toArray();
    }
}