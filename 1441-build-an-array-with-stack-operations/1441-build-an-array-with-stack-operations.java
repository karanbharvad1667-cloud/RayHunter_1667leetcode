class Solution {
    public List<String> buildArray(int[] arr, int k) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        for (int num = 1; num <= k && i < arr.length; num++) {
            ans.add("Push");
            if (num == arr[i]) {
                i++;
            } else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}