class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0&&
            (i==0||a[i-1]==0)&&
            (i==a.length-1||a[i+1]==0)){
                i++;
                count++;
            }
        }
        return count>=n;
        
    }
}