class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int num=arr[mid];
            int correctno=mid+1;
            int noofmising=num-correctno;
            if(noofmising>= k) hi=mid-1;
            else lo=mid+1;
        }
        return hi+k+1;
    }
}