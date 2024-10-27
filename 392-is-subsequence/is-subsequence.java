class Solution {
    public boolean isSubsequence(String s, String t) {

        int sl=s.length();
        int tl=t.length();

        if(sl>tl)return false;
        if(sl==0)return true;


        int j=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j))j++;
            if(j==sl)return true;
        }
        return false;
    }
}