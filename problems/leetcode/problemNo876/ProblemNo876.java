package problems.leetcode.problemNo876;

public class ProblemNo876 {
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fstptr = head;
        ListNode slwptr = head;
        while(fstptr.next != null && fstptr.next.next != null){
            slwptr = slwptr.next;
            fstptr = fstptr.next.next;
        }
        if(fstptr.next == null){
            return slwptr;
        }
        return slwptr.next;
    }
}
