//optimal kadans algorithm
class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0) sum=0;
        }
        return max;
    }
}
// // better tc=O(n^2)
// class Solution {
//     public int maxSubArray(int[] arr) {
//         int n=arr.length;
//         if(n==1) return arr[0];
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j]; 
//                 max=Math.max(sum,max);   
//             }  
//         }
//         return max;
//     }
// }

//brute tc=O(n^3)
// class Solution {
//     public int maxSubArray(int[] arr) {
//         int n=arr.length;
//         if(n==1) return arr[0];
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=arr[k];
//                 }
//                 max=Math.max(sum,max);
//             }
//         }
//         return max;
//     }
// }