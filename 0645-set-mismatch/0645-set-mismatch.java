class Solution {
    public int[] findErrorNums(int[] arr) {
        int arrr[]=new int[2];
        int m=arrr.length;
        int n=arr.length;
        int i=0;
        while(i<n){
         int rindex=arr[i]-1;
          if(arr[i]==i+1||arr[rindex]==arr[i]) i++;
          else{
            swap(arr,i,rindex);
          }
        }
        for(i=0;i<n;i++){
         if(arr[i]!=i+1){
           arrr[0]+=arr[i];
           arrr[1]+=i+1;
         }
        }
        return arrr;
    }
    public void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
