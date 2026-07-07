class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }  
}
// class Solution {
//     //3. tabulation tc o(n) as o(1) // space optimization
//     public int fib(int n) {
//         int[] dp = new int[3];
//         if (n <= 1) return n;
//         dp[0]=0;dp[1]=1;  
//         for(int i=2;i<=n;i++){
//             dp[2]=dp[1]+dp[0];
//             dp[0]=dp[1];
//             dp[1]=dp[2];
//         }
//         return dp[2];
//     }
// }
// class Solution {
//     //3. tabulation tc o(n) as o(n)
//     public int fib(int n) {
//         int[] dp = new int[n + 1];
//         if (n <= 1) return n;
//         dp[0]=0;dp[1]=1;  
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }
//1. in simple recursion O(2^n)
//2. recursion +memoization
 // tc=o(n) as=>O(n)(dp array) + O(n) (stack) = O(n)
// class Solution {
//     static int[] dp;
//     public int fib(int n) {
//         dp = new int[n + 1];
//         return dp(n);
//     }
//     public int dp(int n) {
//         if (n <= 1) return n;
//         if (dp[n] != 0) return dp[n];//extra
//         int ans = dp(n - 1) + dp(n - 2);
//         dp[n] = ans;//extra
//         return ans;
//     }
// }