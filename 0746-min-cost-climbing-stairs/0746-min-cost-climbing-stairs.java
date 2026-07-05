class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int dp[]=new int [n];
        dp[0]=arr[0];
        if(n>1) dp[1]=arr[1];
        for(int i=2;i<n;i++){
            dp[i]=Math.min(arr[i]+dp[i-2],arr[i]+dp[i-1]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}

// class Solution {
//     static int[] dp;
//     public int minCostClimbingStairs(int[] cost) {
//         int n=cost.length;
//         dp=new int[n];
//         Arrays.fill(dp,-1);
//         return Math.min(mincost(0,cost),mincost(1,cost));
//     }
//     public int mincost(int i,int[] cost) {
//         if(i>=cost.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         return dp[i]=cost[i]+Math.min(mincost(i+1,cost),mincost(i+2,cost));
//     }
// }