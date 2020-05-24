/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode curr = null;
    ListNode next = null;
    ListNode tonext = null;
    ListNode end = null;
    int count = 0;
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        end = head;
        while(end.next!=null)
        {
            end = end.next;
            count++;
        }
        
        count++;
        if(count<=2)
        {
            return head;
        }
        count = count/2;
        curr = head;
        while(count>0)
        {
            next = curr.next;
            tonext = next.next;
            curr.next = tonext;
            curr = tonext;
            end.next = next;
            end = next;
            end.next = null;
            count--;
        }
        return head;
    }
   
}

 