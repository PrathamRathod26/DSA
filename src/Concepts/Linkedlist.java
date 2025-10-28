package Concepts;

import java.util.LinkedList;
// This is how LinkedList work under the hood

public class Linkedlist {
    Node head;
    int size;

    Linkedlist(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        size--;

        if(head.next == null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next = null;
    }

    public void printList(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("Null" + "\nSize of list: " + size);
        System.out.println();

    }

    public void reverseIterate(){
        if(head ==null || head.next == null ){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        list.addLast("Linked");
        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}


//public class Linkedlist {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.addFirst("a");
//        list.addFirst("is");
//        System.out.println(list);
//        list.addFirst("This");
//        list.addLast("Linked");
//        list.add("List");
//        System.out.println(list);
//        System.out.println(list.size());
//        for (int i=0; i<list.size();i++){
//            System.out.print(list.get(i) + "->");
//        }
//        System.out.println("Null");
//        list.removeFirst();
//        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//    }
//}
