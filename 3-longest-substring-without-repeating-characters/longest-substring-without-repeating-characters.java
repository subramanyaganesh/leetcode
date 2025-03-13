class Solution {
    public int lengthOfLongestSubstring(String s) {
    int j=0,max=0;
    Set<Character> set=new HashSet<>();
    for(int i=0;i<s.length();i++){
        if(set.contains(s.charAt(i))){
            while(s.charAt(j)!=s.charAt(i)){
                set.remove(s.charAt(j));
                j++;
            }
            set.remove(s.charAt(j));
            j++;
        }
        set.add(s.charAt(i));
        max=Math.max(max,set.size());
    }
    return max;   
    }
}