class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=']'){
                stack.add(c+"");
            }
            else if(c==']'){
                StringBuilder sb=new StringBuilder();
                while(!stack.isEmpty()&&!stack.peek().equals("[")){
                    sb.insert(0,stack.pop());
                }
                //System.out.println("This is sb "+sb);
                if(!stack.isEmpty()&&stack.peek().equals("["))stack.pop();
                StringBuilder pb=new StringBuilder();
                int num=-1;
                try{
                    while(!stack.isEmpty()){
                        num=Integer.parseInt(stack.peek());
                        stack.pop();
                        pb.insert(0,num);
                    }
                }catch(Exception e){}
                if(!pb.isEmpty())stack.push(String.valueOf(sb).repeat(Integer.parseInt(pb.toString())));
            }
            //System.out.println(stack);
        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop());
        }
        return ans.toString();
    }
}