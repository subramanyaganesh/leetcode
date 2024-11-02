class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> list=new ArrayList<>();
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       list.add(intervals[0]);
       for(int i=1;i<intervals.length;i++){
        
        if(list.get(list.size()-1)[1]<intervals[i][0]){
            list.add(intervals[i]);
        }else if(list.get(list.size()-1)[1]<intervals[i][1]){
            int[] a=new int[]{
                list.get(list.size()-1)[0],
                intervals[i][1]};
            list.remove(list.size()-1);
            list.add(a);
        }
       }
       return list.toArray(new int[list.size()][]);
    }
}