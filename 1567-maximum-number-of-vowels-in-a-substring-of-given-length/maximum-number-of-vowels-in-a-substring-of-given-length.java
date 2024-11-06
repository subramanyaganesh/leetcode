class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
        else return false;
    }
    public int maxVowels(String s, int k) {
        Queue<Character> queue=new LinkedList<>();
        int count=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(queue.size()>=k){
                char p=queue.poll();
                if(isVowel(p))count--;
            }
            queue.add(c);
            if(isVowel(c))count++;
            max=Math.max(max,count);
        }
        return max;
    }
}