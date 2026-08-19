class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
       int n=arr.length;
       Arrays.sort(arr);
       List<List<Integer>> ans =new ArrayList<>();
       for(int i=0;i<n-1;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
               if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long) arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}

// better
// class Solution {
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         int n = arr.length;
//         HashSet<List<Integer>> set = new HashSet<>();
//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 HashSet<Long> st = new HashSet<>();
//                 for (int k = j + 1; k < n; k++) {
//                     long sum = (long) arr[i] + arr[j] + arr[k];
//                     long fourth = (long) target - sum;
//                     if (st.contains(fourth)) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(arr[i]);
//                         temp.add(arr[j]);
//                         temp.add(arr[k]);
//                         temp.add((int) fourth);
//                         Collections.sort(temp);
//                         set.add(temp);
//                     }
//                     st.add((long) arr[k]);
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }

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