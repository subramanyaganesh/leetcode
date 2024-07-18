class Solution {
    public int reverse(int x) {
        
        long sum=0;
        
        while(x!=0){
            if(sum*10>=Integer.MAX_VALUE||sum*10+(x%10)>=Integer.MAX_VALUE||sum*10<=Integer.MIN_VALUE||sum*10+(x%10)<=Integer.MIN_VALUE)return 0;
            sum=sum*10+(x%10);
            x/=10;
        }
        
        return (int)sum;
    }
}