class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())return false;
        else if(s.isEmpty())return true;
        int j=0;
        int m=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                m++;
                j++;
                if(m==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}