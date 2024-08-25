class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.compute(c,(k,v)->v==null?1:v+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry=pq.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
        
    }
}