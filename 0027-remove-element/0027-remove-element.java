class Solution {
    public int removeElement(int[] arr, int val) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]==val){ 
                arr[i]=arr[j];
                j--;
            }else{
                i++;
            }
        }
        return j+1;
    }
}