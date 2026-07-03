class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int arr[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while (i < m) arr[k++] = a[i++];
        while (j < n) arr[k++] = b[j++];
        for (int x = 0; x < m + n; x++) a[x] = arr[x];
    }
}