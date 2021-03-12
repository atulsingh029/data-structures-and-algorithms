package problems.leetcode.problemNo1290;

// Problem
/*
Given head which is a reference node to a singly-linked list.
The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
*/


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }

class Solution {
    /* Driver code */
    public static void main(String[] args) {
        int [] testcase = {1,0,1,0,1,1};
        ListNode ll = new ListNode();
        ListNode head = ll;
        for (int i = 0; i < testcase.length; i++) {
            ll.val = testcase[i];
            if(i != testcase.length-1){
                ll.next = new ListNode();
                ll = ll.next;
            }
        }
            ListNode iterator=head;
            while (iterator.next != null){
                System.out.print(iterator.val + " -> ");
                iterator = iterator.next;
            }
            System.out.println(iterator.val);
        int r = getDecimalValue(head);
        System.out.println(r);
    }


    // Solution
    // Space complexity O (m) : m is maximum length of linkedlist as per problem constraint, in this problem 30
    // Another approach : Instead of creating an array just reverse the linkedlist and process it. (not tried yet)
    public static int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode iter= head;
        int count =0;
        int binState = 1;
        int llsize =0;
        int [] store = new int[30];
        while(iter.next != null){
            llsize++;
            if(iter.val == 1){
                store[count]=1;
            }
            iter = iter.next;
            count++;
        }
        if(iter.val == 1){
            store[count] =1;
        }
        for(int i=llsize;i>=0;i--){
            if(store[i] == 1){
                result = result + binState;
            }
            binState = binState*2;
        }
        return result;
    }
}