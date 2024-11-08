class Solution {
    public int sumOfUnique(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        int sum=0;
        int dup=0;
        for(int i:nums){
            if(set.contains(i)){
                if(!duplicate.contains(i)){
                    dup+=i;
                    duplicate.add(i);
                }
            }else {
                set.add(i);
                sum+=i;}
        }
        return Math.max(sum-dup,0);
    }
}