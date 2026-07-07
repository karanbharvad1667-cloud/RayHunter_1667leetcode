class Solution {
    public int rob(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        // Case 1: exclude last house
        int[] dp1 = new int[n];
        dp1[0] = arr[0];
        dp1[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i <= n - 2; i++) {
            dp1[i] = Math.max(arr[i] + dp1[i - 2], dp1[i - 1]);
        }
        // Case 2: exclude first house
        int[] dp2 = new int[n];
        dp2[1] = arr[1];
        dp2[2] = Math.max(arr[1], arr[2]);
        for (int i = 3; i <= n - 1; i++) {
            dp2[i] = Math.max(arr[i] + dp2[i - 2], dp2[i - 1]);
        }
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
// class Solution {
//     static int[] dp;
//     public int rob(int[] arr) {
//         int n = arr.length;
//         if (n == 1) return arr[0];
//         // Case 1 : Exclude last house
//         dp = new int[n];
//         Arrays.fill(dp, -1);
//         int case1 = loot(0, n - 2, arr);
//         // Case 2 : Exclude first house
//         dp = new int[n];
//         Arrays.fill(dp, -1);
//         int case2 = loot(1, n - 1, arr);
//         return Math.max(case1, case2);
//     }
//     public int loot(int i, int end, int[] arr) {
//         if (i > end) return 0;
//         if (dp[i] != -1) return dp[i];
//         int pick = arr[i] + loot(i + 2, end, arr);
//         int skip = loot(i + 1, end, arr);
//         return dp[i] = Math.max(pick, skip);
//     }
// }