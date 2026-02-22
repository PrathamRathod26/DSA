package LinkedList.LeetCodeQuestions;

import Nodes.ListNode;

import static LinkedList.HelperFunctions.*;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] a1 = {2,4,3};
        ListNode l1 = createLLFromArray(a1);
        int[] a2 = {5,6,4,4,7,8,2,6};
        ListNode l2 = createLLFromArray(a2);

        ListNode sum = addTwoNumbers(l1,l2);
        printLL(sum);
    }
}
