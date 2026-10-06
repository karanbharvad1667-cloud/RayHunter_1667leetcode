class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int sum=0;
        int max=0;
        int ans=0;
        
        for(int x:arr){
            sum+=x;
            max=Math.max(max,x);
        }
        int lo=max;
        int hi=sum;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(day(mid,arr)<=days){
                ans=mid;
                hi=mid-1;
            }else lo=mid+1;
        }
        return ans;
    }
    public int day(int capacity,int[]arr){
        int c=capacity;
        int day=1;
        for(int x:arr){
            if(c>=x) c-=x;
            else{
                day++;
                c=capacity-x;
            }
        }
        return day;
    }
}