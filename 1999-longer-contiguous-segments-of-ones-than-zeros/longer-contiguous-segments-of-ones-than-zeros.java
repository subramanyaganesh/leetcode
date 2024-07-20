class Solution {
    public boolean checkZeroOnes(String s) {

        int one=0;
        int zero=0;
        int m1=0,m2=0;
        for(char c:s.toCharArray()){
            if(c=='0'){
                zero++;
                m2=Math.max(m2,one);
                one=0;
            }else{
                one++;
                m1=Math.max(m1,zero);
                zero=0;

            }
        }
        m2=Math.max(m2,one);
        m1=Math.max(m1,zero);
        return m2>m1;
        
    }
}