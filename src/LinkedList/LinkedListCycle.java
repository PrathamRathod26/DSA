package LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle node

        System.out.println(n1.val + " ->" + n2.val + " ->" + n3.val + " ->" + n4.val + " ->" +n2.val);
        System.out.println("Does list have cycle? " + hasCycle(n1));

        MyLinkedLIst list = new MyLinkedLIst();
        list.addLast(1);
        list.addLast(2);;
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        System.out.println("Does list have cycle? " + hasCycle(list.head));

    }
}
