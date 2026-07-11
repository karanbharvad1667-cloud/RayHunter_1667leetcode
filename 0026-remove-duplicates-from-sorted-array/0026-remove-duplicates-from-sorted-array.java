class Solution {
    public int removeDuplicates(int[] arr) {
        int slow=0;
        for(int fast=1;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return slow+1;
    }
}
// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int idx=1;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]!=arr[idx-1]){
//                 arr[idx]=arr[i];
//                 idx++;
//             }
//         }
//         return idx;
//     }
// }