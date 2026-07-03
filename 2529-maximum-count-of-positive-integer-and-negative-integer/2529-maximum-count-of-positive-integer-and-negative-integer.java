class Solution {
    public int maximumCount(int[] arr) {
        int n=arr.length;
        int lo=0,hi=n-1;
        //for finding negative count
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=0) hi=mid-1;
            else lo=mid+1;  
        }
        int ncount=lo;
        // for count positive number  
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=0) lo=mid+1;
            else hi=mid-1;  
        } 
         int pcount=n-lo;
         return Math.max(ncount,pcount);
    }       
}

