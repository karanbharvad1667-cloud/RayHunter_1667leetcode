class Solution {
    public int search(int[] arr, int x) {
        int n= arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid+1;
        }
        return -1;
    }
}