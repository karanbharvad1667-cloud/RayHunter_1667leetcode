class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i||arr[i]==n) i++; // correct index or last position
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
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}