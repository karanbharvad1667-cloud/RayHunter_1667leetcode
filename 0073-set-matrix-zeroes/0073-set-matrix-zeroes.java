class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int col[]=new int[m];
        int row[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    col[j]=1;
                    row[i]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(col[j]==1||row[i]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
}


// class Solution {
//     public void setZeroes(int[][] arr) {
//         int n=arr.length;
//         int m=arr[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]==0){
//                    markrow(i,arr);
//                    markcol(j,arr);
//                 }
//             }
//         }   
//      for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]==-1000){
//                     arr[i][j]=0;
//                 }
//             }
//         }
//     } 
//     public void markrow(int i,int[][]arr){
//         int m=arr[0].length;
//         for(int j=0;j<m;j++){
//             if(arr[i][j]!=0){
//             arr[i][j]=-1000;
//            }
//         }
//     }
//     public void markcol(int j,int[][]arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             if(arr[i][j]!=0){
//             arr[i][j]=-1000;
//            }
//         }
//     }
// }