class Solution {
    public String reverseWords(String s) {
        String []str=s.trim().split("\\s+");// remove whitespace and leading space
        String result="";
        int n=str.length;
        for(int i=n-1;i>0;i--){
            result+=str[i]+" ";
        }
        return result+str[0];
    }
}