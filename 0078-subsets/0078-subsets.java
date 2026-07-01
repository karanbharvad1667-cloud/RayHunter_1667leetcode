class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        int m=1<<n;  // 2^n
        for(int i=0;i<m;i++){ // m no of subseets
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++){ 
                if((i>>j)%2==1) a.add(arr[j]); 
            }
            ans.add(a);
        }
        return ans;
    }
}