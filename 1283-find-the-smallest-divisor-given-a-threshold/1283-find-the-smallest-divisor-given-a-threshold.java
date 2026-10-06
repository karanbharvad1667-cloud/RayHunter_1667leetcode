class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int n=arr.length;
        int max=0;
        for(int x:arr){
            max=Math.max(max,x);
        }
        int lo=1;
        int hi=max;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int x=thresould(arr,mid);
            if(x<=t){
                ans=mid;
                hi=mid-1;
            }else lo=mid+1;
        }
        return ans;
    }
    public int thresould(int[]arr,int mid){
        int t=0;
        for(int x:arr){
            if(x%mid==0){
                t+=x/mid;
            }else{
                t+=x/mid+1;
            }
        }
        return t;
    }
}