class Solution {
    public void sortColors(int[] arr) {
        int zeros=0;
        int ones=0;
        int twos=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }else if(arr[i]==1){
                ones++;
            }else{
                twos++;
            }
        }
        while(zeros>0){
            arr[k++]=0;
            zeros--;
        }
        while(ones>0){
            arr[k++]=1;
            ones--;
        }
        while(twos>0){
            arr[k++]=2;
            twos--;
        }
    }
}