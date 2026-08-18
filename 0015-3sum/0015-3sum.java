class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> set =new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> st=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
                if(st.contains(third)){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(third);
                    temp.add(arr[j]);
                    temp.sort(null);
                    set.add(temp);
                }
                st.add(arr[j]);
            }
        }
        ans.addAll(set);
        return ans;
    }
}
// // brute force tc=(n^3 * log(no. of unique triplet))
//  // space=2*O(no of triplet)
// class Solution {
//     public List<List<Integer>> threeSum(int[] arr) {
//         List<List<Integer>> ans=new ArrayList<>();
//         HashSet<List<Integer>> set=new HashSet<>();
//         int n=arr.length;
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(arr[i]+arr[j]+arr[k]==0){
//                         List<Integer> temp=new ArrayList<>();
//                         temp.add(arr[i]);
//                         temp.add(arr[j]);
//                         temp.add(arr[k]);
//                         temp.sort(null);
//                         set.add(temp);
//                     }
//                 }
//             }
//         }
//         ans.addAll(set);
//         return ans;
//     }
// }