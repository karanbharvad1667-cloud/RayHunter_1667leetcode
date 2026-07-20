class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
       ListNode head2=new ListNode(-1);
       ListNode t=head2;
       ListNode temp=head;
       while(temp!=null){
        if(temp.val!=val){
            t.next=temp; 
            t=temp;
            temp=temp.next; 
         }else{
            temp=temp.next;
         }
       }
       t.next=null;
        return head2.next;
    }
}