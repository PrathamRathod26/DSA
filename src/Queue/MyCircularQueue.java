package Queue;

import java.util.Arrays;

public class MyCircularQueue {
    public int[] arr;
    public int size;
    public int front = -1;
    public int rear = -1;

    public MyCircularQueue(int n){
        this.size = n;
        arr = new int[n];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public void add(int data){
        if((rear+1)%size==front){
            System.out.println("Could not add: "+ data);
            return;
        }

        if(isEmpty()){
            front = 0;
        }

        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }

        int value = arr[front];
        arr[front]=0;

        if(front==rear){
            front = rear = -1;
        } else {
            front = (front+1)%size;
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public void printQueue(){
        System.out.println(Arrays.toString(arr));
    }
}
