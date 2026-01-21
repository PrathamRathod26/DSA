package LinkedList;

import Nodes.Nodes;

public class MyLinkedLIst {
    Nodes head;

    public void addLast(int val){
        Nodes newNode = new Nodes(val);
        if(head==null){
            head=newNode;
            return;
        }
        Nodes temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addFirst(int val){
        Nodes newNode = new Nodes(val);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Nodes temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
