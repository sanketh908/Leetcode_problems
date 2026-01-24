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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return head;
        }
      ListNode ln=new ListNode(0);
      ListNode real= ln;

      while(head!=null)
      {
        if(head.val!=real.val|| ln==real)
        {
            real.next=new ListNode(head.val);
            real=real.next;
           
        }
       
        head=head.next;
      }  
      return ln.next;
    }
}