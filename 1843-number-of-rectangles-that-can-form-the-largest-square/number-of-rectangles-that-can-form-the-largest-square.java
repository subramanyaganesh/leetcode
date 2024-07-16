class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int[] a:rectangles){
            map.compute(Math.min(a[0],a[1]),(k,v)->v==null?1:v+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getKey()-a.getKey());

        pq.addAll(map.entrySet());

        return pq.poll().getValue();

        
    }
}