/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,ListNode> h=new HashMap<>();
        while(head!= null)
        {
            if(h.containsKey(head))
            {
                return true;
            }
            h.put(head,head);
            head=head.next;
        }
        return false;
    }
}