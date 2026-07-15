class Solution {
    public void wiggleSort(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = arr.clone();
        int i = (n - 1) / 2;
        int j = n - 1;

        int idx = 0;

        while (idx < n) {
            if (idx % 2 == 0) {
                arr[idx++] = temp[i--];
            } else {
                arr[idx++] = temp[j--];
            }
        }
    }
}