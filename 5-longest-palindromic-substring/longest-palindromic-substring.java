class Solution {
    public String expandCenter(String s, int start, int end){

        while(start>=0&&end<s.length()){
            //System.out.println(start+"\t"+end);
            if(s.charAt(start)==s.charAt(end)){
                start--;
                end++;
            }else break;
        }
        return s.substring(start+1,end);
    }
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length();i++){
            String s1=expandCenter(s,i,i);
            String s2=expandCenter(s,i,i+1);
            if(s1.length()>s2.length()){
                if(s1.length()>max.length()){
                    max=s1;
                }
            }else{
                if(s2.length()>max.length()){
                    max=s2;
                }
            }
        }
        
        return max;
    }
}