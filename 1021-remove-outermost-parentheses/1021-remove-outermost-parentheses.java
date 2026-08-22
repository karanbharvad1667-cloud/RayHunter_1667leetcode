class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        String result="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                if(count>1){
                result+="(";
              }
            }else{
                count--;
                if(count>0){
                    result+=")";
                }
            }   
        }
        return result;
    }
}