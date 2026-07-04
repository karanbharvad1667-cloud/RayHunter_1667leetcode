class Solution {
    static int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        return climb(n);
    }

    public int climb(int n) {
        if (n <= 2) return n;

        if (dp[n] != 0) return dp[n];

        int ans = climb(n - 1) + climb(n - 2);

        dp[n] = ans;
        return ans;
    }
}