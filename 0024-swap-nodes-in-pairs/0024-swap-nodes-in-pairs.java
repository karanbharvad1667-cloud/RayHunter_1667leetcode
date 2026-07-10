class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;

        while(temp.next!=null && temp.next.next!=null){

            ListNode slow=temp.next;
            ListNode fast=temp.next.next;

            // connect previous node with second node
            temp.next=fast;

            // connect first node with remaining list
            slow.next=fast.next;

            // connect second node with first node
            fast.next=slow;

            // move temp to end of swapped pair
            temp=slow;
            fast=slow;
        }

        return dummy.next;
    }
}