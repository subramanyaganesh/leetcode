class Solution {
    public String convert(String s, int numRows) {

        String[] sb=new String[numRows];
        Arrays.fill(sb,"");
        int i=0;
        int j=0;
        while(i<s.length()){
            while(i<s.length()&&j<numRows){
                sb[j++]+=s.charAt(i++);
            }
            j-=Math.min(numRows,2);
            while(i<s.length()&&j>=0){
                sb[j--]+=s.charAt(i++);
            }
            j+=Math.min(numRows,2);
        }
        StringBuilder ss=new StringBuilder();
        for(String p:sb){
            ss.append(p);
        }
        return ss.toString();
        
    }
}