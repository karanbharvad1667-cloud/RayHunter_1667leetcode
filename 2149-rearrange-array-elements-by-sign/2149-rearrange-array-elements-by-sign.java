class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n=arr.length;
        int crr[]=new int[n/2];
        int brr[]=new int [n/2];
        int idx=0,k=0;
    
        for(int i=0;i<n;i++){
           if(arr[i]>0) brr[idx++]=arr[i];
           else crr[k++]=arr[i];
        }
        k=0;
        idx=0;
        for(int j=0;j<n;j++){
            if(j%2==0) arr[j]=brr[idx++];    
            else arr[j]=crr[k++];
        }
        return arr;
    }
}