class Solution {
    public int numDifferentIntegers(String word) {

        String[] ans=word.split("[a-z]");
        Set<String> set=new HashSet<>();
        for(String str:ans){
            if(!str.isEmpty()){
                int y=0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='0')y++;
                    else break;
                }
                set.add(str.substring(y));
                //System.out.println(set);
            }
            
        }
        return set.size();

        
    }
}