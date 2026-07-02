class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }else arr[i] = 0; 
        }
        // If we reach here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
