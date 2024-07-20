class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String min="";
        String max="";
        String minFixed="";

        if(str1.length()<str2.length()){
            min=minFixed=str1;
            max=str2;
        }else {
            min=minFixed=str2;
            max=str1;
        }
       for(int i=0;!min.isEmpty();i++){
        if(max.replaceAll(min,"").isEmpty()&&minFixed.replaceAll(min,"").isEmpty()){
            return min;
        }
        min=min.substring(0,min.length()-1);
       }
    return min;
        

    }
}