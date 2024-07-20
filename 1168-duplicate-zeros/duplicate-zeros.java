class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                queue.add(arr[i]);
            }
            queue.add(arr[i]);
            arr[i]=queue.poll();
        }
         
    }
}