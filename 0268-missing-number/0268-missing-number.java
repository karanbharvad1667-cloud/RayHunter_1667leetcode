class Solution {
    public int missingNumber(int[] arr) {
        // basic method 
        // int n=nums.length;
        // int sum = n*(n+1)/2;
        // int numsSum=0;
        // for(int ele:nums){
        //     numsSum+=ele;
        // }
        // return sum-numsSum;

        // using cyclic sort
       int n=arr.length;
       int i=0;
       while(i<n){
        if(arr[i]==i||arr[i]==n)i++;
        else{
            int idx=arr[i];
            swap(arr,i,idx);
        }
       }
       for(int j=0;j<n;j++){
        if(arr[j]!=j) return j;
       }
       return n;
    }
    public void swap(int arr[],int i,int idx){
        int temp =arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}