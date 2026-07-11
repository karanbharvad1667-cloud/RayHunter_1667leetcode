class Solution {
    public int removeDuplicates(int[] arr) {
        //if(arr.length==0) return 0;
        int idx=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[idx-1]){
                arr[idx]=arr[i];
                idx++;
            }
        }
        return idx;
    }
}