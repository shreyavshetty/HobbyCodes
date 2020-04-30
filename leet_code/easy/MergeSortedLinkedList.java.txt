/**
QuestionLink : https://leetcode.com/problems/merge-two-sorted-lists
Time Complexity = O(n) n- length of string
Space Complexity = O(n)
**/
import java.util.*;
//Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode(0,null);
        ListNode curr = head;
        while(temp1!=null && temp2!=null)
        {
            
            if(temp1.val > temp2.val)
            {
                curr.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            else
            {
                curr.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            }
            curr = curr.next;
            
        }
        while(temp1!=null)
        {
            curr.next = new ListNode(temp1.val);
            temp1 = temp1.next;
            curr = curr.next;
            
        }
        while(temp2!=null)
        {
            curr.next = new ListNode(temp2.val);
            temp2 = temp2.next;
            curr = curr.next;
            
        }
        return head.next;
        
    }
}