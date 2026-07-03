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
        int n= arr.length;// becouse 1 element is missing in array
        int i=0;
        while(i<n){
            if(arr[i]==i||arr[i]==n) i++;
            else{
                int idx=arr[i];
                swap(arr,i,idx);
            }
        }
            for( i=0;i<arr.length;i++){
                if(arr[i]!=i) return i;
            }
         return arr.length;
    }
    public void swap(int arr[],int i,int idx){
        int temp=arr[i];
       arr[i]=arr[idx];
        arr[idx]=temp;
    }
}