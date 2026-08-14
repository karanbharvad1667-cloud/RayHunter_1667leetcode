class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generaterow(i));
        }
        return ans;
    }
    public List<Integer> generaterow(int row) {
        List<Integer>ansrow=new ArrayList<>();
        int ans=1;
        ansrow.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/(col);
            ansrow.add(ans);
        }
        return ansrow;
    }
}