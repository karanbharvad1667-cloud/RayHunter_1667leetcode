class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int longest=1;
        int n=arr.length;
        if(n==0) return 0;
        int pre=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]-1==pre){
                count++;
                pre=arr[i];
            }else if(arr[i]!=pre){
                count=1;
                pre=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}

// brute time complexity=(n^2)
// class Solution {
//     public int longestConsecutive(int[] arr) {
//         int z=arr.length;
//         int longest=0;
//         for(int i=0;i<z;i++){
//             int count =0;
//             int n=arr[i];
//             while(ls(arr,n)==true){
//                 n=n+1;
//                 count++;
//             }
//             longest=Math.max(longest,count);
//         }
//         return longest;
//     }
//     public boolean ls(int []arr,int x){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x) return true;
//         }
//         return false;
//     }
// }