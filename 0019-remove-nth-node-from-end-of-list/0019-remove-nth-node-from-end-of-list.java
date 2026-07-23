class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode temp=head;
        ListNode fast=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==n) return head.next;
        for(int i=1;i<size-n;i++){
            fast=fast.next;
        }
        fast.next=fast.next.next;
        return head;
    }
}