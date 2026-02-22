package LinkedList;

import Nodes.ListNode;

public class HelperFunctions {
    public static ListNode createLLFromArray(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int a : arr) {
            current.next = new ListNode(a);
            current = current.next;
        }

        return dummy.next; // head of the created linked list
    }

    public static void printLL(ListNode a) {
        while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
}
