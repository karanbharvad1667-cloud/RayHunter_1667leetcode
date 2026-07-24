
class Solution {
    //   public ListNode reverse(ListNode head){
    //      if(head==null||head.next==null) return head;
    //     ListNode c=head;
    //     ListNode p=null;
    //     ListNode f=null;
    //     while(c!=null){
    //        f=c.next;
    //        c.next=p;
    //        p=c;
    //        c=f;
    //     }
    //     return p;
    //   }
    public boolean isPalindrome(ListNode head) {
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // ListNode head2=slow;
        // slow.next=null;
        // head2=reverse(head2);
        // ListNode i=head;
        // ListNode j=head2;
        // while(j!=null){
        //     if(i.val!=j.val) return false;
        // }
        // return true;
    ListNode temp=head;
        ArrayList<Integer>arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n=arr.size();
        int i=0,j=n-1;
        while(i<=j){
            if(arr.get(i++)!=arr.get(j--)) return false;
        }
        return true;
    }
}