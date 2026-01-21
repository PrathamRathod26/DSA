package Stack;

import Nodes.Nodes;

import java.util.ArrayList;


public class MyStack {
    public static Nodes head;

    public static boolean isEmpty(){
        return head == null;
    }

    public static void printStack() {
        if(isEmpty()){
            System.out.print("Stack is empty");
        }
        Nodes temp = MyStack.head;

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }


    public static void push(int data){
        Nodes newNode = new Nodes(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }


//    ----------------------------------------------------------------------------

//    public static ArrayList<Integer> list = new ArrayList<>();
//    public static boolean isEmpty(){
//        return list.size() == 0;
//    }
//
//    public void printStack(){
//        if(isEmpty()){
//            System.out.print("Stack is empty");
//        }
//        for (int i = list.size()-1; i >= 0; i--) {
//            System.out.print(list.get(i));
//        }
//        System.out.println();
//    }
//
//    public static void push(int data){
//        list.add(data);
//    }
//
//    public static int pop(){
//        if(isEmpty()){
//            return -1;
//        }
//        int top = list.get(list.size()-1);
//        list.remove(list.size()-1);
//        return top;
//    }
//
//    public static int peek(){
//        if(isEmpty()){
//            return -1;
//        }
//        return list.get(list.size()-1);
//    }


}
