class Solution {
    public int minDays(int[] arr, int m, int k) {
        int n=arr.length;
        if(m*k>n) return -1;

        int min=0;
        int max=0;
        for(int x:arr){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }

        int lo=min;
        int hi=max;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(posible(mid,arr,m,k)){
                ans=mid;
                hi=mid-1;
            }else lo=mid+1;
        }
        return ans;
    }
    public boolean posible(int day,int[] arr,int m,int k){
        int booke=0;
        int n=arr.length;

        int cnt=0;
        for(int i=0;i<n;i++){
            if(day>=arr[i]){
                cnt++;
            }else{
                booke+=cnt/k;
                cnt=0;
            }
        }
        booke+=cnt/k;

        if(booke>=m) return true;
        else return false;
    }
}