class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode t1 = d1;
        ListNode t2 = d2;

        ListNode temp = head;
        int i = 0;

        while(temp != null){

            if(i % 2 == 0){
                t1.next = temp;
                t1 = t1.next;
            }else{
                t2.next = temp;
                t2 = t2.next;
            }

            temp = temp.next;
            i++;
        }

        t1.next = d2.next;
        t2.next = null;

        return d1.next;
    }
}