class Solution {
    public String longestCommonPrefix(String[] str) {
        int n=str.length;
        String result=str[0];
        for(int i=1;i<n;i++){
            while(!str[i].startsWith(result)){
                result=result.substring(0,result.length()-1);

                if(result.length()==0) return "";
            }
        }
       return result;
    }
}