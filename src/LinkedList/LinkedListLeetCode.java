package LinkedList;

import Nodes.ListNode;

public class LinkedListLeetCode {
    public static ListNode createLLFromArray(int[] arr) {
        ListNode dummy = new ListNode(0); // sentinel node
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }

        if(n>size){
            return null;
        }

        int position = size - n - 1;
        System.out.println(position);

        while(head!=null){
            if(position==1){
                head.next = head.next.next;
            }
            position--;
        }
        return null;
    }
}
