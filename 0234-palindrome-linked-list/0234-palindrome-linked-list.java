class Solution {

    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode p = null;

        while(c != null){
            ListNode f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // find middle
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // odd length: skip middle node
        if(fast != null){
            slow = slow.next;
        }

        // split list
        prev.next = null;

        // reverse second half
        ListNode head2 = reverse(slow);

        // compare
        ListNode i = head;
        ListNode j = head2;

        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }

        return true;
    }
}