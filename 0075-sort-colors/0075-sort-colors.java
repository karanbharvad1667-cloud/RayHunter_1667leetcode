class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int ones=0,twos=0,zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)zeros++;
            else if(arr[i]==1) ones++;
            else twos++;
        }
        int i=0;
         int idx=0;
        while(i<zeros){
            arr[idx++]=0;
            i++;
        }
         i=0;
        while(i<ones){
            arr[idx++]=1;
            i++;
        }
        i=0;
        while(i<twos){
            arr[idx++]=2;
            i++;
        }
    }
}