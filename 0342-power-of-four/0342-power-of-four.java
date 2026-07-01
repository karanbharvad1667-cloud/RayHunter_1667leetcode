class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return (isPowerOftwo(n) && isSquare(n));
    }
    public boolean isPowerOftwo(int n) {
        return ((n&(n-1))==0);
    }
    public boolean isSquare(int n) {
        int x=(int)Math.sqrt(n);
        return (x*x==n);
    }
}