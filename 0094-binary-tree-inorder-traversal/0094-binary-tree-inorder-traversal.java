class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         ArrayList<Integer> ans=new ArrayList<>();
         inorder(root,ans);
         return ans;
    }
    public void inorder(TreeNode root,List<Integer> ans) {
         if(root==null) return;
         inorder(root.left,ans);
         ans.add(root.val);
         inorder(root.right,ans);
    }
}

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> ans=new ArrayList<>();
//         TreeNode curr=root;
//         while(curr!=null){
//             if(curr.left!=null){
//                 // find pred
//                 TreeNode pred=curr.left;
//                 while(pred.right!=null && pred.right!=curr){
//                     pred=pred.right;
//                     if(pred.right==null){//link
//                         pred.right=curr;
//                         curr=curr.left;
//                     }else{//pred.right=curr
//                         pred.right=null;
//                         ans.add(curr.val);
//                         curr=curr.right;
//                     }
//                 }

//             }else{//left=null
//                 ans.add(curr.val);
//                 curr=curr.right;
//             }
//         }
//         return ans;
//     }
// }