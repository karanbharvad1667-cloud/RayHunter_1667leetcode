class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
       
        int maxcount=-1;
        int maxele=0;
        for(int i=0;i<n;i++){ 
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>maxcount){
                maxcount=count;
                maxele=arr[i];
            }

        }
       return maxele;
    }
}