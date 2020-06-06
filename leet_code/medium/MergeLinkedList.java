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
    public ListNode findMiddle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode a, ListNode b)
    {
       ListNode result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        if (a.val <= b.val) { 
            result = a; 
            result.next = merge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = merge(a, b.next); 
        } 
        return result; 
    }
    public ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next == null)
        {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode middleNext = middle.next;
        middle.next = null;
        ListNode l1 = mergeSort(head);
        ListNode l2 = mergeSort(middleNext);

        return merge(l1,l2);
        
    }
    public ListNode sortList(ListNode head) {
        
        
        return mergeSort(head);
        
        
        
    }
}