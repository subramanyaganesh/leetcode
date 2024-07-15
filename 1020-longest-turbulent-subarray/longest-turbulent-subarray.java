class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length<=2){
            if(arr.length==1)return 1;
            else if(arr[0]==arr[1])return 1;
            else return 2;   
        }
        int[] d=new int[arr.length-1];
        int max=0;

        //-5,-2,8,-3,1,0,-7,8
        for(int i=1;i<arr.length;i++){
            d[i-1]=arr[i]-arr[i-1];
        }
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<d.length;i++){
            if(stack.isEmpty()){
               if(d[i]!=0) stack.add(d[i]);
            }
            else if(stack.peek()>0&&d[i]<0||stack.peek()<0&&d[i]>0)stack.push(d[i]);
            else{
                max=Math.max(max,stack.size());
                stack.clear();
                if(d[i]!=0)stack.add(d[i]);
            }
        }
        return Math.max(max,stack.size())+1;        
    }
}