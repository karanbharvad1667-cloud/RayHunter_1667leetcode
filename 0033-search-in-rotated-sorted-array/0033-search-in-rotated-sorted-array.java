class Solution {
    public int search(int[] arr, int x) {
       int n=arr.length;
       int lo=0,hi=n-1;
       while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==x) return mid;
       else if(arr[lo]<=arr[mid]){
            if(x>=arr[lo]&&x<arr[mid]) hi=mid-1;
            else lo=mid+1;
        }else{
            if(x>arr[mid]&&x<=arr[hi]) lo=mid+1;
            else hi=mid-1;
        }
       }
       return -1;
    }
}
