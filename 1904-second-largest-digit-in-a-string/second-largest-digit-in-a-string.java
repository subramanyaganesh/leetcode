class Solution {
    public int secondHighest(String s) {
        int l=-1;
        int sl=-1;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int a=Integer.parseInt(c+"");
                if(a>l){
                    sl=l;
                    l=a; 
                }else if(a>sl&&a!=l){
                    sl=a;
                }
            }
        }
        return sl;
        
    }
}