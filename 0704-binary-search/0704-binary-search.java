class Solution {
    public int binaryhelper(int[] arr, int target,int lo,int hi) {
        if(lo>hi) return -1;
        int mid=(lo+hi)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binaryhelper(arr,target,lo,mid-1);
        else return binaryhelper(arr,target,mid+1,hi);
    }
    public int search(int[] arr, int target) {
        int n=arr.length;
       return binaryhelper(arr,target,0,n-1);
    }

    // public int search(int[] arr, int target) {
    //     int n=arr.length;
    //    int low=0;
    //    int high=n-1;
    //    while(low<=high){
    //     int mid =(low+high)/2;
    //     if(arr[mid]>target) high=mid-1;
    //     else if(arr[mid]<target) low=mid+1;
    //     else return mid;
    //    }
    //    return -1;
    // }
}