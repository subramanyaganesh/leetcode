class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];

        
        int prev=s.length();
        
        for(int i=0;i<s.length();i++){
            int k=s.indexOf(c,i);
            if(k!=-1){
                ans[i]=Math.min(Math.abs(prev-i),k-i);
                //System.out.println(prev+"\t"+i+"\t"+k+"\t"+ans[i]);
                if(k==i)prev=k;
            }else ans[i]=Math.abs(prev-i);
            
            
        }
        return ans;
    }
}