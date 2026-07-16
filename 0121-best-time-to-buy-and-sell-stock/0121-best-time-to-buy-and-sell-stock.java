class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE,maxp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]-min>maxp) maxp=arr[i]-min;
        }
        return maxp;
    }
}