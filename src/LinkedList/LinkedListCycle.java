package LinkedList;

import Nodes.Nodes;

public class LinkedListCycle {
    public static boolean hasCycle(Nodes head){
        if(head==null){
            return false;
        }
        Nodes fast = head;
        Nodes slow = head;

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
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle node

        System.out.println(n1.data + " ->" + n2.data + " ->" + n3.data + " ->" + n4.data + " ->" +n2.data);
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
