class Solution {
    public String largestOddNumber(String s) {
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            int x=s.charAt(i)-'0';
            if(x%2!=0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}