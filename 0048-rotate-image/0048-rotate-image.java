// optimal solution 
// class Solution {
//     public void rotate(int[][] arr) {
//         int n = arr.length;
//         // Step 1: Transpose the matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }
//         // Step 2: Reverse each row
//         for (int i = 0; i < n; i++) {
//             int left = 0, right = n - 1;
//             while (left < right) {
//                 int temp = arr[i][left];
//                 arr[i][left] = arr[i][right];
//                 arr[i][right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//     }
// }

//  brute force spaceO(2n^2) tc=O(n^2)
class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int[][] res = new int[n][n];
     for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        res[j][n - 1 - i] = arr[i][j];
       }
    }
    for (int i = 0; i < n; i++) {
       for (int j = 0; j < n; j++) {
        arr[i][j] = res[i][j];
       }
    }
    }
}