package Queue;

import java.util.Arrays;

// queue can be created in __ ways,
// queue using array is not efficient as array has a fixed size, if you are forced to create queue using an array we should always check for empty space in the array. Also when we implement remove operation in a queue using array time complexity becomes O(n)
//
public class MyQueue {
    public int[] arr;
    public int size;
    public int rear = -1;

    public MyQueue(int n){
        this.size = n;
        arr = new int[n];
    }

    public boolean isEmpty(){
        return rear == -1;
    }

//    enqueue - O(1)
    public void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full, could not add: "+data);
            return;
        }
        rear++;
        arr[rear] = data;
    }
//    Dequeue - O(n)
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];
        }
        arr[rear]= 0;
        rear--;
        return front;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        return arr[0];
    }

    public void printQueue(){
        System.out.println(Arrays.toString(arr));
    }
}
