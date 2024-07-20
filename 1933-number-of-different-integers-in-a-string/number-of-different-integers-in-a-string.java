class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        boolean in=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                sb.append(word.charAt(i));
            }else if(!sb.isEmpty()){
                while(!sb.isEmpty()&&sb.charAt(0)=='0')sb.deleteCharAt(0);
                set.add(sb.toString());
                sb=new StringBuilder();
            }
        }

        if(!sb.isEmpty()){
            while(!sb.isEmpty()&&sb.charAt(0)=='0')sb.deleteCharAt(0);
            set.add(sb.toString());
        }
        return set.size();
        
    }
}