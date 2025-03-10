class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(!stack.isEmpty()&&stack.peek().matches("\\d+")){
                    stack.push(stack.pop()+c);
                }else stack.push(c+"");
            }else if(c!=']'){
                stack.push(c+"");
            }else{
                StringBuilder sb=new StringBuilder();
                while(!stack.isEmpty()&&!stack.peek().equals("[")){
                    sb.insert(0,stack.pop());
                }
                stack.pop();
                stack.push(String.valueOf(sb.toString()).repeat(Integer.parseInt(stack.pop())));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop());
        }
        return ans.toString();
    }
}