class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)return new ArrayList<>();
        Set<String> answer=new HashSet<>();
        Set<String> set=new HashSet<>();
        StringBuilder p=new StringBuilder();
        for(int i=0;i<10;i++)p.append(s.charAt(i));
        int i=10;
        
        while(i<=s.length()){
            if(set.contains(p.toString())){
                answer.add(p.toString());
            }else{
                set.add(p.toString());
            }
            if(i==s.length())break;
            p=p.deleteCharAt(0).append(s.charAt(i));
            i++;
        }
        return new ArrayList<>(answer);
    }
}