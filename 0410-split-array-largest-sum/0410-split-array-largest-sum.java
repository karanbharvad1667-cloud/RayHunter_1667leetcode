class Solution {
    public int splitArray(int[] arr, int k) {
        int lo=0;
        int hi=0;
        for(int x:arr){
            lo=Math.max(lo,x);
            hi+=x;
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(subarray(arr,mid)>k){
                lo=mid+1;
            }else hi=mid-1;
        }
        return lo;
    }
    public int subarray(int[] arr,int sum){
        int sub=1;
        int  sumation=0;
        for(int x:arr){
            if(sumation+x<=sum){
                sumation+=x;
            }else{
                sub++;
                sumation=x;
            }
        }
        return sub;
    }
}