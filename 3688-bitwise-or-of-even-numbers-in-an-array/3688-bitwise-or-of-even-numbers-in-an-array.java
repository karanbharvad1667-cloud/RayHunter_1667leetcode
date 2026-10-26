class Solution {
    public int evenNumberBitwiseORs(int[] arr) {
        int or=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                or=or|arr[i];
            }
        }
        return or;
    }
}