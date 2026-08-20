
// tc=O(n) sp same
class Solution {
    public int[] twoSum(int[] arr, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        int mising=target-arr[i];
        if(map.containsKey(mising)) return new int[]{i,map.get(mising)}; 
        map.put(arr[i],i);
     }
       return new int[]{};
    }
}


// class Solution { // time complexity =0(n^2)
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     //int arr[]={ i, j };
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[] {}; // if no solution
//     }
// }

// this approach for sorted array
// class Solution {
//     public int[] twoSum(int[] arr, int x) {
//         int i=0;
//         int j=arr.length-1;
//         Arrays.sort(arr);
//         while(i<j){
//             int sum=arr[i]+arr[j];
//             if(sum==x) return new int[]{i,j};
//             else if(sum>x) j--;
//             else i++;
//         }
//         return new int[]{};
//     }
// }

