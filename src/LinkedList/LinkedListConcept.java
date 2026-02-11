package LinkedList;
import Nodes.ListNode;

import static LinkedList.LinkedListLeetCode.*;

public class LinkedListConcept {
    public static void main(String[] args) {
        int[] a1 = {2,4,3};
        ListNode l1 = createLLFromArray(a1);
        int[] a2 = {5,6,4,4,7,8,2,6};
        ListNode l2 = createLLFromArray(a2);

//        ListNode sum = addTwoNumbers(l1,l2);
//        printLL(sum);

        removeNthFromEnd(l2,3);
    }
}
