//Middle of the Linked List
import java.util.*;
class Java169
{
    public static void main(String[] args) {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            // Move the fast pointer twice as fast as the slow pointer
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
    
            // The slow pointer is now at the middle of the list
            return slow;
        }
    }
}