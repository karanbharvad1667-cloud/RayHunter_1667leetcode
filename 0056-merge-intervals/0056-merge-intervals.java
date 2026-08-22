class Solution {
    public int[][] merge(int[][] arr) {
        int n= arr.length;

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[][] ans=new int[n][2];
        int k=0;

        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];

            if(k>0 && end<=ans[k-1][1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            ans[k][0]=start;
            ans[k][1]=end;
            k++;
        }
        return Arrays.copyOf(ans,k);
    }
}