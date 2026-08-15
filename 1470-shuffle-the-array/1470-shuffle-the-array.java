class Solution {
    public int[] shuffle(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int idx=0;
        int brr[]=new int[n];
        while(i<=k&&k<n){
            if(idx%2==0){
             brr[idx]=arr[i];
             i++;
            }else{
                brr[idx]=arr[k];
                k++;
            }
            idx++;
        }
        return brr;
    }
}