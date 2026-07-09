class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode i = h1;
        ListNode j = h2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if(i != null) k.next = i;
        else k.next = j;

        return dummy.next;
    }
}