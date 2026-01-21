package Queue;

import Nodes.Nodes;

public class MyLLQueue {
    static Nodes head = null;
    static Nodes tail = null;

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void add(int data){
        Nodes newNode =  new Nodes(data);
        if(tail==null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }

        int front = head.data;
        if(head == tail){
            tail = null;
        }
        head = head.next;

        return front;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        Nodes temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
