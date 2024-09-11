class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums)map.compute(num,(k,v)->v==null?1:v+1);

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.getValue()-b.getValue()==0){
                    return b.getKey()-a.getKey();

                }else return a.getValue()-b.getValue();
            }
        );
        pq.addAll(map.entrySet());
        int[] ans=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
           Map.Entry<Integer,Integer> entry= pq.poll();
           for(int j=0;j<entry.getValue();j++){
            ans[i++]=entry.getKey();
           }
        }
        //System.out.println(Arrays.toString(ans));
        return ans;
    }
}