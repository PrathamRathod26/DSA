package Concepts;

public class linkedlist {
    Node head;
    int size;

    linkedlist(){
        this.size=0;
    }

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
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
        System.out.print("null");
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
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();

//        list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
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
