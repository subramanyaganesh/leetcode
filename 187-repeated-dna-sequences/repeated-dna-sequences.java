class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)return new ArrayList<>();
        List<String> answer=new ArrayList<>();
        Set<String> set=new HashSet<>();
        StringBuilder p=new StringBuilder();
        for(int i=0;i<10;i++)p.append(s.charAt(i));
        int i=10;
        
        while(i<=s.length()){
            String s1=p.toString();
            if(set.contains(s1)){
                if(!answer.contains(s1))
                    answer.add(s1);
            }else{
                set.add(s1);
            }
            if(i==s.length())break;
            p=p.deleteCharAt(0).append(s.charAt(i));
            i++;
        }
        return answer;
    }
}