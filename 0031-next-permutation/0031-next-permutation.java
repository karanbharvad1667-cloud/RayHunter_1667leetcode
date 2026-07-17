class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        // Step 1: Find the pivot (first decreasing element from the right)
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        // Step 2: If pivot exists, find the next greater element
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i])  j--;
            // Swap pivot and next greater element
            swap(arr, i, j);
        }
        // Step 3: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }
}