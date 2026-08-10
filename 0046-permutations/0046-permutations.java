class Solution {
    public List<List<Integer>> permute(int[] arr) {
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[n];
        permutation(arr,ans,ds,freq);
        return ans;
    }
    public void permutation(int []arr,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                permutation(arr,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}