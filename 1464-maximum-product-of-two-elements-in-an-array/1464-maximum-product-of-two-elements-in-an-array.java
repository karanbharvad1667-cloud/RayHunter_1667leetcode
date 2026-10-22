class Solution {
    public int maxProduct(int[] arr) {
        int max=0;
        int smax=0;
        for(int x:arr){
            if(x>max){
                smax=max;
                max=x;
            }else if(x>smax) smax=x;
        }
        return( max-1)*(smax-1);
    }
}