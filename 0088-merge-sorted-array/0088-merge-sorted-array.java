class Solution {
    public void merge(int[] a, int n, int[] b, int m) {
       int i=n-1;
       int j=0;
       while(i>=0&&j<m){
        if(a[i]>b[j]){
            int temp=b[j];
            b[j]=a[i];
            a[i]=temp;  
        }else{
            break;
        }
        i--;
        j++;
       }
       int idx=0;
       for(int k=n;k<n+m;k++){
        a[k]=b[idx++];
       }
       Arrays.sort(a);
    }
} 

// class Solution {
//     public void merge(int[] a, int m, int[] b, int n) {
//         int i = 0, j = 0 ,k=0;
//         while (i < m && j < n) {
//             if (a[i] <= b[j]){
//                i++;
//                if(a[i]==0) k=i;
//             }else{
//             int temp=b[j];
//                b[j]=a[i];
//                a[i]=temp;  
//             }
//         }
//         while(j<n) a[k++]=b[j++];
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