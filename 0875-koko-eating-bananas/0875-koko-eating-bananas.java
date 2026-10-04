class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int x:piles) max=Math.max(max,x);

        int lo=1;
        int hi=max;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(hour(mid,piles)<=h){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public long hour(int mid,int[]arr){
        long h=0;
        for(int x:arr){
            if(x%mid==0){
                h+=x/mid;
            }else{
                h+=x/mid+1;
            }
        }
        return h;
    }
}