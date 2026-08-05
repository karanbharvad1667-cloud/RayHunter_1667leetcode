//dutch national algorithm
class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int lo=0,mid=0,hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            }else if(arr[mid]==1) mid++;
            else {//arr[mid]==2;
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    public void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}



// class Solution {
//     public void sortColors(int[] arr) {
//         int n=arr.length;
//         int ones=0,twos=0,zeros=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0)zeros++;
//             else if(arr[i]==1) ones++;
//             else twos++;
//         }
//         int i=0;
//          int idx=0;
//         while(i<zeros){
//             arr[idx++]=0;
//             i++;
//         }
//          i=0;
//         while(i<ones){
//             arr[idx++]=1;
//             i++;
//         }
//         i=0;
//         while(i<twos){
//             arr[idx++]=2;
//             i++;
//         }
//     }
// }