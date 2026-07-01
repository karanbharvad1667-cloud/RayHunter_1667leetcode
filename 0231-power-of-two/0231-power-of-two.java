class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0 ||n==0) return false;//O(1)
        return ((n&(n-1))==0);
    }

    //1 method

    // public boolean isPowerOfTwo(int n) {
    //     if(n==0) return false;
    //     if(n==1) return true;// tc=O(logn) and as=O(logn)
    //     if(n%2==1) return false;
    //     return isPowerOfTwo(n/2);
    // }

    //2 method

    // public boolean isPowerOfTwo(int n) {
    //     if(n==0) return false;//tc=O(logn) as=0
    //     if(n==1) return true;
    //     if(n<0) return false;
    //      while(n>1){
    //     if(n%2==1) return false;
    //     n=n/2;
    // }
    // return true;
    // }

  
}