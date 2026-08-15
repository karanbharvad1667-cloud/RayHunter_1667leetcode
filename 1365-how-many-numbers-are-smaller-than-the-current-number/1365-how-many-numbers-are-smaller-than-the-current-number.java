class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n=arr.length;
        int brr[]=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]) count++;
            }
            brr[idx++]=count;
        }
        return brr;
    }
}