class Solution {
    public int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);

        int ans = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                ans++;
            }
        }

        return ans;
    }
}