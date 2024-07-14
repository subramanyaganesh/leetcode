class Solution {
    public int[] constructRectangle(int area) {
        if(area<2)return new int[]{1,1};
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<=area/2;i++){
            if(area%i==0){
                int g=area/i;
                list.add(new int[]{Math.max(i,g),Math.min(i,g)});
            }
        }
        return list.get(list.size()/2);
    }
}