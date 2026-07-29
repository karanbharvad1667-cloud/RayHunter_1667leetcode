class Solution {
    public int diagonalSum(int[][] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
             sum+=arr[i][i];
             if(i!=n-1-i) sum+=arr[i][n-1-i];// right top corner to left down corner
        }
        return sum;
    }
}