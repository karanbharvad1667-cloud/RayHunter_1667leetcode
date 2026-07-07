class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int dp[] = new int[3];

        dp[0] = cost[0];

        if (n == 1) return cost[0];

        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[2] = cost[i] + Math.min(dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return Math.min(dp[0], dp[1]);
    }
}
// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int n=cost.length;
//         int dp[]=new int [n];
//         dp[0]=cost[0];
//         if(n>1) dp[1]=cost[1];
//         for(int i=2;i<n;i++){
//             dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
//         }
//         return Math.min(dp[n-1],dp[n-2]);
//     }
// }

// class Solution {
//     static int[] dp;
//     public int minCostClimbingStairs(int[] cost) {
//         int n=cost.length;
//         dp=new int[n];
//         costays.fill(dp,-1);
//         return Math.min(mincost(0,cost),mincost(1,cost));
//     }
//     public int mincost(int i,int[] cost) {
//         if(i>=cost.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         return dp[i]=cost[i]+Math.min(mincost(i+1,cost),mincost(i+2,cost));
//     }
// }