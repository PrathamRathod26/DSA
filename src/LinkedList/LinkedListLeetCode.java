package LinkedList;

import Nodes.ListNode;

public class LinkedListLeetCode {
    public static ListNode createLLFromArray(int[] arr){
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for(int a : arr){
            current.next = new ListNode(a);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printLL(ListNode a){
        while(a.next != null){
            System.out.print(a.val + " ");
            a = a.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0); // creating a dummy list
        ListNode curr = dummy; // intialising a pointer
        int carry = 0; // initialising our carry with 0 initial
        // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it.
        // We will add that as well into our list
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; // initialising our sum
            if(l1 != null){ // adding l1 to our sum & moving l1
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ // adding l2 to our sum & moving l2
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // if we have carry then add it into our sum
            carry = sum/10; // if we get carry, then divide it by 10 to get the carry
            // the value we'll get by modulating it, will become as new node so. add it to our list
            curr.next = new ListNode(sum % 10); // curr will point to that new node if we get
            curr = curr.next; // update the current every time
        }
        return dummy.next;
    }
}
