class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int max=0;
        int m=0;
        for(int i=0;i<n;i++){
           if(arr[i]==1) max++;
           else if(arr[i]==0){
            if(max>m){
             m=max;
             max=0;
            } 
            max=0;
           }  
        }
        if(max>m){
             m=max;
        } 
        return m;
    }
}