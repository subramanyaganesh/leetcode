class Solution {
    public int[] NSER(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&arr[stack.peek()]>arr[i])
                stack.pop();

            if(stack.isEmpty()){
                ans[i]=arr.length;
            }else{
                ans[i]=stack.peek();
            }
            stack.add(i);
        }
        return ans;
    }


    public int[] NSEL(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i])
                stack.pop();

            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=stack.peek();
            }
            stack.add(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] left=NSEL(arr);
        int[] right=NSER(arr);


        // for(int i:prefix)System.out.print(i+"\t");
        // System.out.println();
        // for(int i:left)System.out.print(i+"\t");
        // System.out.println();
        // for(int i:right)System.out.print(i+"\t");

        long answer=0L;
        int mod=(int)1e9+7;

        for(int i=0;i<arr.length;i++){
            answer+=(long)(i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            answer%=mod;

            //0+1*1-0*arr[0];
            //1+1*4-1*1
        }
        return (int)answer;
    }
}