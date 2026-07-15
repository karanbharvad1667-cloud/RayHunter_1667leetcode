class Solution {
    public List<Integer> majorityElement(int[] arr) {

        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (ans.contains(arr[i])) continue;

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) count++;

            }

            if (count > n / 3) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}