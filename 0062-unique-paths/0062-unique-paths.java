// one liner solution m+n-2Cm-1  // o(m) O(1)
//......B.....
class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;

        int[][] dp = new int[2][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        dp[1][0] = 1;

        for (int i = 1; i < m; i++) {
            if (i % 2 == 1) {
                dp[1][0] = 1;
                for (int j = 1; j < n; j++) {
                    dp[1][j] = dp[0][j] + dp[1][j - 1];
                }
            } else {
                dp[0][0] = 1;
                for (int j = 1; j < n; j++) {
                    dp[0][j] = dp[1][j] + dp[0][j - 1];
                }
            }
        }
       return Math.max(dp[1][n-1], dp[0][n-1]);
    }
}
//.....A.......
// class Solution {
//     public int uniquePaths(int m, int n) {
//         if(m==1||n==1) return 1;
//         int[][] dp=new int[2][n];
//          for(int j=0;j<n;j++){// filling zeroth row with 1
//             dp[0][j]=1;
//          }
//          dp[1][0]=1;
//         for(int i=0;i<m-1;i++){
//             for(int j=1;j<n;j++){// filling 1 row with element
//             dp[1][j]=dp[1][j-1]+dp[0][j];
//             }
//             // copying row
//             for(int j=1;j<n;j++){// filling 1 row with element
//                 dp[0][j]=dp[1][j];
//             }   
//         }
//         return dp[1][n-1];
//     }
// }  
// class Solution {
//     // tc=O(mn) as=o(mn)
//     public int uniquePaths(int m, int n) {
//         int[][] dp=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0||j==0) dp[i][j]=1;
//                 else dp[i][j]=dp[i-1][j]+dp[i][j-1];
//             }
//         }
//         return dp[m-1][n-1];
//       }
//     }  

// class Solution {
//     // tc=O(mn) as=o(mn) extra recursive space
//     public int uniquePaths(int m, int n) {
//         int[][] dp=new int[m+1][n+1];
//         return Paths(m,n,dp);
//       }
//       public int Paths(int m, int n,int [][]dp) {//m to 1 ,n to 1
//         if(m==1||n==1) return 1;
//         if(dp[m][n]!=0) return dp[m][n];
//         return dp[m][n]= Paths(m-1,n,dp)+Paths(m,n-1,dp);
//      }
//     }  


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