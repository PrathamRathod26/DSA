package LinkedList;

import Nodes.Nodes;

public class RemoveNthFromEnd {


    public static Nodes removeNthNodeFromEnd(Nodes head, int n){
        if(head.next == null){
            return null;
        }

        int size = 0;
        Nodes current = head;
        while(current!= null){
            current = current.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

        int indexToDelete = size - n;

        Nodes prev = head;
        int i = 1;
        while(i<indexToDelete){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        MyLinkedLIst list = new MyLinkedLIst();
        list.addLast(1);
        list.addLast(2);;
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();


        list.head = removeNthNodeFromEnd(list.head, 2);
        list.printList();
    }
}
