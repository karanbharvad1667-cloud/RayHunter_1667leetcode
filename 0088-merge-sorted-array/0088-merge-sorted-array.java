class Solution {
    public void merge(int[] a, int n, int[] b, int m) {
        int i=n-1,j=m-1,k=n+m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[k]=a[i];
                i--;
            }else{
                a[k]=b[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            a[k--]=b[j--];
        }
    }
} 


// class Solution {
//     public void merge(int[] a, int n, int[] b, int m) {
//         int len = n + m;
//         int gap = len / 2 + len % 2;
//         while (gap > 0) {
//             int le = 0;
//             int ri = le + gap;

//             while (ri < len) {

//                 if (le < n && ri >= n) {//1 2
//                     swap(a, b, le, ri - n);

//                 } else if (le >= n) {// 2 2
//                     swap(b, b, le - n, ri - n);

//                 } else {// 1 1
//                     swap(a, a, le, ri);
//                 }

//                 le++;
//                 ri++;
//             }

//             if (gap == 1) break;
//             gap = gap / 2 + gap % 2;
//         }
//         for (int i = 0; i < m; i++) {
//             a[n + i] = b[i];
//         }
//     }
//     public void swap(int[] arr, int[] brr, int i, int j) {
//         if (arr[i] > brr[j]) {
//             int temp = arr[i];
//             arr[i] = brr[j];
//             brr[j] = temp;
//         }
//     }
// }
// class Solution {
//     public void merge(int[] a, int n, int[] b, int m) {
//     //    int i=n-1;
//     //    int j=0;
//     //    while(i>=0&&j<m){
//     //     if(a[i]>b[j]){
//     //         int temp=b[j];
//     //         b[j]=a[i];
//     //         a[i]=temp;  
//     //     }else{
//     //         break;
//     //     }
//     //     i--;
//     //     j++;
//     //    }
//        int idx=0;
//        for(int k=n;k<n+m;k++){
//         a[k]=b[idx++];
//        }
//        Arrays.sort(a);
//     }
// } 



// class Solution {
//     public void merge(int[] a, int m, int[] b, int n) {
//         int arr[] = new int[m + n];
//         int i = 0, j = 0, k = 0;
//         while (i < m && j < n) {
//             if (a[i] <= b[j]) arr[k++] = a[i++];
//             else arr[k++] = b[j++];
//         }
//         while (i < m) arr[k++] = a[i++];
//         while (j < n) arr[k++] = b[j++];
//         for (int x = 0; x < m + n; x++) a[x] = arr[x];
//     }
// } 