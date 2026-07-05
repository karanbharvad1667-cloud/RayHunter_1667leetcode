class Solution {
    static int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        return Paths(m,n);
      }
      public int Paths(int m, int n) {
        if(m==1||n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n]= Paths(m-1,n)+Paths(m,n-1);
     }
    }  


 //first method
    //class Solution {
    // public int uniquePaths(int m, int n) {
    //     if(m==1||n==1) return 1;
    //     return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    // }
    //}
    //second method
// class Solution {
//     public int Paths(int cr,int cc,int lr, int lc) {
//         if(cr==lr||cc==lc) return 1;
//         if(cr>lr || cc>lc) return 0;
//         int right=Paths(cr,cc+1,lr,lc);
//         int down=Paths(cr+1,cc,lr,lc);
//         return right+down;
//     }
//     public int uniquePaths(int m, int n) {
//         return Paths(0,0,m-1,n-1);
//     }
// }