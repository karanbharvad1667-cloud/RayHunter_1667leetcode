class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        map.put(arr[i],i);
       }
       int brr[]=new int[2];
       for(int i=0;i<arr.length;i++){
           int mising=target-arr[i];
           if(map.containsKey(mising)&&map.get(mising)!=i){
            brr[0]=i;
            brr[1]=map.get(mising);
           }
       }
       return brr;
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
