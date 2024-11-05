class Solution {
    public int maxTurbulenceSize(int[] arr) {

        if(arr.length==1)return 1;
        
        int[] diff=new int[arr.length-1];

        for(int i=1;i<arr.length;i++){
            int d=arr[i]-arr[i-1];
            if(d>0){
                diff[i-1]=1;
            }else if(d<0){
                diff[i-1]=-1;
            }else
                diff[i-1]=0;
        }
        
        System.out.println(Arrays.toString(diff));
        //100,100,100,100,101,100
        ///0,0,0,1,-1
        
        
        int max=0;
        int count=0;
        int start=diff[0];
        for(int i=1;i<diff.length;i++){
            if(start!=0){
                if(start*-1==diff[i])
                    count++;
                else count=0;
            }
            start=diff[i];
            max=Math.max(max,count);
            
            
            //System.out.println("max= "+max);
        }
        if(max==0&&start==0){
            return 1;
        }else if(max==0&&start!=0){
            return 2;
        }else return max+2;
    }
}