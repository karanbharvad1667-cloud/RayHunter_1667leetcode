class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode temp=head;
        ListNode t=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int idx=size/2;
      for(int i=0;i<idx-1;i++){
        t=t.next;
     }
     if(t.next!=null){
         t.next=t.next.next;
         return head;
     }
        head.next=null;
        return head;
    }
}