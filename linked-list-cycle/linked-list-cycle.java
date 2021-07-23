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
    		HashMap<ListNode,Integer> hash = new HashMap<>();
			ListNode temp = new ListNode(0);
			while(head != null) {
				if (hash.containsKey(head)) {
					return true;
				}
				hash.put(head, head.val);
				head = head.next;
			}
			return false;
			
		}
}