class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans =new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n){
            int rightidx=arr[i]-1;
            if(arr[i]==i+1||arr[rightidx]==arr[i])i++;
            else{
                swap(arr,i,rightidx);
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) ans.add(j+1);
        }
        return ans;
    }
    public void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}