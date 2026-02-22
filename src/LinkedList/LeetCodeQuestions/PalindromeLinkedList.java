package LinkedList.LeetCodeQuestions;

import LinkedList.MyLinkedList;
import Nodes.Nodes;

public class PalindromeLinkedList {
    public static Nodes reverse(Nodes head){
        Nodes prev = null;
        Nodes curr = head;

        while (curr != null){
            Nodes next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Nodes findMiddle(Nodes head){
        Nodes slow = head;
        Nodes fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Boolean isPalindrome(Nodes head){
        if(head == null || head.next == null){
            return true;
        }

        Nodes middle = findMiddle(head);
        Nodes secondHalfStart = reverse(middle.next);
        Nodes firstHalfStart = head;

        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        list.printList();

        System.out.println(isPalindrome(list.head));
    }
}
