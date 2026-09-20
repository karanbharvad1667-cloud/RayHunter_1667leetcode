class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int j=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}
// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int n=arr.length;
//         int j=0;
//         for(int i=1;i<n;i++){
//             if(arr[i]!=arr[j]){
//                 j++;
//                 arr[j]=arr[i];
//             }
//         }
//         return j+1;
//     }
// }