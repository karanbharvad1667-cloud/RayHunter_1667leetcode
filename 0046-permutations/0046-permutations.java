class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        permutation(0,arr,ans);
        return ans;
    }
    public void permutation(int idx,int []arr,List<List<Integer>> ans){
        if(idx==arr.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            permutation(idx+1,arr,ans);
            swap(i,idx,arr);
        }
    }
    public void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//tc=(n!)*(n) space=O(n)+(n)
// class Solution {
//     public List<List<Integer>> permute(int[] arr) {
//         int n=arr.length;
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> ds=new ArrayList<>();
//         boolean freq[]=new boolean[n];
//         permutation(arr,ans,ds,freq);
//         return ans;
//     }
//     public void permutation(int []arr,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
//         if(ds.size()==arr.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=0;i<arr.length;i++){
//             if(!freq[i]){
//                 freq[i]=true;
//                 ds.add(arr[i]);
//                 permutation(arr,ans,ds,freq); 
//                 ds.remove(ds.size()-1); 
//                 freq[i]=false;
//             }
//         }
//     }
// }