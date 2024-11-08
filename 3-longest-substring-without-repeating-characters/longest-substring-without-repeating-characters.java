class Solution {
    public int lengthOfLongestSubstring(String s) {

        
        Queue<Character> queue=new ArrayDeque<>();
        int max=0;
        for(char c:s.toCharArray()){
            if(!queue.contains(c)){
                queue.add(c);
                max=Math.max(max,queue.size());

            }else{
                while(queue.peek()!=c)queue.poll();
                queue.poll();
                queue.add(c);
            }
        }
        return max;
        
    }
}