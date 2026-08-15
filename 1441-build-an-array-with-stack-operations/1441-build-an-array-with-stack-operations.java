class Solution {
    public List<String> buildArray(int[] arr, int k) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        int num = 1;

        while (num <= k && i < arr.length) {
            ans.add("Push");

            if (num == arr[i]) {
                i++;
            } else {
                ans.add("Pop");
            }

            num++;
        }

        return ans;
    }
}