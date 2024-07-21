class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        String[] result = word.split("[a-zA-Z]");
        for(String s:result){
            int n=s.length();
            if(!s.isEmpty()){
                while(!s.isEmpty()&&s.charAt(0)=='0')s=s.substring(1);
                set.add(s);
            }
        }
        return set.size();
        
    }
}