class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = i; j < n; j++) {
                product *= arr[j];
                max = Math.max(max, product);
            }
        }

        return max;
    }
}