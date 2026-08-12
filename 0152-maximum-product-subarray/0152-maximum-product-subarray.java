class Solution {
    public int maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // If current element is negative, swap max and min
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
// class Solution {
//     public int maxProduct(int[] arr) {
//         int n = arr.length;
//         int max = arr[0];
//         for (int i = 0; i < n; i++) {
//             int product = 1;

//             for (int j = i; j < n; j++) {
//                 product *= arr[j];
//                 max = Math.max(max, product);
//             }
//         }
//         return max;
//     }
// }