class Solution {
    public int climbStairs(int n) {
      int[] dp = new int[n + 1];
        if (n <= 1) return n;
        dp[0]=1;dp[1]=1;  
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}


// class Solution {
//     static int[] dp;
//     public int climbStairs(int n) {
//         dp = new int[n + 1];
//         return climb(n);
//     }
//     public int climb(int n) {
//         if (n <= 2) return n;
//         if (dp[n] != 0) return dp[n];
//         int ans = climb(n - 1) + climb(n - 2);
//         dp[n] = ans;
//         return ans;
//     }
// }