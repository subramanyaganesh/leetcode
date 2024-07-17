class Solution {
    public char getbracket(char c){
        switch(c){
            
            case '}':
            return '{';
           
            case ')':
            return '(';
            
            case ']':
            return '[';

            default: 
                return ' ';
        }
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')stack.add(c);
            else if(!stack.isEmpty()&&stack.peek()==getbracket(c)){
                stack.pop();
            }else return false;
        }
        return stack.isEmpty();
    }
}