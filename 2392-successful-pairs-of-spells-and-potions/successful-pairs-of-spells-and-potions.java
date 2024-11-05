class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int[] ans=new int[spells.length];

        for(int i=0;i<spells.length;i++){
            long successFactor = (success + spells[i] - 1) / spells[i];
            int j=bs(potions,successFactor);
            ans[i]=potions.length-j;
        }
        return ans;
    }
    public int bs(int[] potions,long successFactor){
        int i=0;
        int j=potions.length;
        
        while(i<j){
            int mid=i+(j-i)/2;
            if(potions[mid]<successFactor){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i;
    }
}