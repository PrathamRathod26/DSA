package LinkedList.LeetCodeQuestions;

import LinkedList.MyLinkedList;
import Nodes.ListNode;
import Nodes.Nodes;

import java.util.List;

public class DetectCycle {
    public static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        ListNode result = detectCycle(n1);

        if (result != null) {
            System.out.println("Cycle detected.");
            System.out.println("Cycle starts at node with value: " + result.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
