class Solution {
    public boolean checkZeroOnes(String s) {

        Stack<Character> one=new Stack<>();
        Stack<Character> zero=new Stack<>();
        int m1=0,m2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero.push(s.charAt(i));
                m2=Math.max(m2,one.size());
                one.clear();
            }else{
                one.push(s.charAt(i));
                m1=Math.max(m1,zero.size());
                zero.clear();

            }
        }
        m2=Math.max(m2,one.size());
        m1=Math.max(m1,zero.size());
        return m2>m1;
        
    }
}