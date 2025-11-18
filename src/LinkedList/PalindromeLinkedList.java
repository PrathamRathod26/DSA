package LinkedList;

public class PalindromeLinkedList {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;

        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        MyLinkedLIst list = new MyLinkedLIst();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(1);

        list.printList();

        System.out.println(isPalindrome(list.head));
    }
}
