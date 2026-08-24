// tc=O(logn) sp(logn)
class Solution {
    public int search(int[] arr, int x) {
        int n=arr.length;
        int lo=0,hi=n-1;
        return binaryhelper(arr,lo,hi,x);
    }
    public int binaryhelper(int[] arr,int lo,int hi, int x) {
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x) return binaryhelper(arr,lo,mid-1,x);
        else return binaryhelper(arr,mid+1,hi,x);
    }
}


// // time compexity tc=O(logn)  space=(1)

// class Solution {
//     public int search(int[] arr, int x) {
//         int n= arr.length;
//         int lo=0;
//         int hi=n-1;
//         while(lo<=hi){
//             int mid=lo+(hi-lo)/2;
//             if(arr[mid]==x) return mid;
//             else if(arr[mid]>x) hi=mid-1;
//             else lo=mid+1;
//         }
//         return -1;
//     }
// }