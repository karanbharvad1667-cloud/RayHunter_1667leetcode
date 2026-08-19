class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;

        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {

                HashSet<Long> st = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long sum = (long) arr[i] + arr[j] + arr[k];
                    long fourth = (long) target - sum;

                    if (st.contains(fourth)) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int) fourth);

                        Collections.sort(temp);
                        set.add(temp);
                    }

                    st.add((long) arr[k]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}

// brute force 
// class Solution {
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         int n=arr.length;
//         List<List<Integer>> ans= new ArrayList<>();
//         HashSet<List<Integer>> set =new HashSet<>();
//         for(int i=0;i<n-3;i++){
//             for(int j=i+1;j<n-2;j++){
//                 for(int k=j+1;k<n-1;k++){
//                     for(int h=k+1;h<n;h++){
//                         if(arr[i]+arr[j]+arr[k]+arr[h]==target){
//                             List<Integer> temp=new ArrayList<>();
//                             temp.add(arr[i]);
//                             temp.add(arr[j]);
//                             temp.add(arr[k]);
//                             temp.add(arr[h]);
//                             temp.sort(null);
//                             set.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         ans.addAll(set);
//         return ans;
//     }
// }