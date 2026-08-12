class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(arr[k][j]!=0){

                        arr[k][j]=-1000;
                        }
                    }
                    for(int h=0;h<m;h++){
                        if(arr[i][h]!=0){

                        arr[i][h]=-1000;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1000){
                    arr[i][j]=0;
                }
            }
        }
    }
}