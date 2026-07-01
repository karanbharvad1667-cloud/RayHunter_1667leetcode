class Solution {
    public int matrixScore(int[][] arr) {
        // 0th col of matrix should have all 1
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<n;i++){
            if(arr[i][0]==0){// flip that row
             for(int j=0;j<m;j++){
                arr[i][j]=1-arr[i][j];
               }   
            }
        }
        //har us col ko flip karo jisme no of 0>1
        
        for(int j=0;j<m;j++){
            int zeros=0,ones=0;
            for(int i=0;i<n;i++){
              if(arr[i][j]==0)zeros++;
              else ones++;
         }
         if(zeros>ones){// flip that column
            for(int i=0;i<n;i++){
                arr[i][j]^=1;
            }
         }
        }
        int sum=0;
        int pow=1;
        for(int j=m-1;j>=0;j--){
            int one=0;
            for(int i=0;i<n;i++){
              if(arr[i][j]==1) one++;
           }
            sum+=pow*one;
            pow*=2;
        }
        return sum;
    }
}