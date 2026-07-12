class Solution {
    public void moveZeroes(int[] arr){
        int n=arr.length;
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-1;j++){
            if(arr[j]==0){
                swap(arr,j,j+1);
            }
           }
       }
    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}