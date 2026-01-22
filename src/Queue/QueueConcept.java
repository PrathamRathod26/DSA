package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {
    public static void testQueue(){
        Queue<Integer> q = new LinkedList<>();

        System.out.println("---- Test Case 1: Empty queue ----");
        System.out.println("Is empty: " + q.isEmpty()); // true

        System.out.println("\n---- Test Case 2: Remove from empty ----");
        System.out.println("Removed: " + q.poll()); // null (SAFE)

        System.out.println("\n---- Test Case 3: Peek from empty ----");
        System.out.println("Peek: " + q.peek()); // null

        System.out.println("\n---- Test Case 4: Add first element ----");
        q.add(10);
        System.out.println(q);

        System.out.println("\n---- Test Case 5: Add multiple elements ----");
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        System.out.println("\n---- Test Case 6: Peek after adds ----");
        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("\n---- Test Case 7: Remove single element ----");
        System.out.println("Removed: " + q.poll()); // 10
        System.out.println(q);

        System.out.println("\n---- Test Case 8: Remove all elements ----");
        System.out.println("Removed: " + q.poll()); // 20
        System.out.println("Removed: " + q.poll()); // 30
        System.out.println("Removed: " + q.poll()); // 40
        System.out.println(q);

        System.out.println("\n---- Test Case 9: Remove when empty again ----");
        System.out.println("Removed: " + q.poll()); // null

        System.out.println("\n---- Test Case 10: Add after empty ----");
        q.add(50);
        q.add(60);
        System.out.println(q);

        System.out.println("\n---- Test Case 11: FIFO verification ----");
        System.out.println("Removed: " + q.poll()); // 50
        System.out.println("Removed: " + q.poll()); // 60

        System.out.println("\n---- Test Case 12: Final empty check ----");
        System.out.println("Is empty: " + q.isEmpty()); // true
    }

    public static void testCircularQueue(){
        System.out.println("---- Test Case 1: Add till full ----");
        MyCircularQueue w = new MyCircularQueue(3);
        w.add(1);
        w.add(2);
        w.add(3);
        w.printQueue(); // expected: [1, 2, 3]

        System.out.println("\n---- Test Case 2: Add when full ----");
        w.add(4); // should NOT be added

        System.out.println("\n---- Test Case 3: Remove all elements ----");
        System.out.println("Removed: " + w.remove()); // 1
        System.out.println("Removed: " + w.remove()); // 2
        System.out.println("Removed: " + w.remove()); // 3

        System.out.println("\n---- Test Case 4: Remove when empty ----");
        System.out.println("Removed: " + w.remove()); // -1

        System.out.println("\n---- Test Case 5: Add after empty ----");
        w.add(5);
        w.printQueue(); // expected: [5, ?, ?]

        System.out.println("\n---- Test Case 6: Wrap-around behavior ----");
        w.add(6);
        w.add(7);       // queue should wrap here
        w.printQueue(); // expected circular placement

        System.out.println("\n---- Test Case 7: Add when full again ----");
        w.add(8); // should fail

        System.out.println("\n---- Test Case 8: Remove some & reuse space ----");
        System.out.println("Removed: " + w.remove()); // 5
        w.add(9); // should go into freed space
        w.printQueue();

        System.out.println("\n---- Test Case 9: Peek element ----");
        System.out.println("Peek: " + w.peek());

        System.out.println("\n---- Test Case 10: Single element behavior ----");
        MyCircularQueue single = new MyCircularQueue(1);
        single.add(100);
        single.printQueue();
        System.out.println("Removed: " + single.remove());
        System.out.println("Removed again: " + single.remove()); // -1
    }

    public static void testArrayQueue(){
        System.out.println("---- Test Case 1: Create queue & check empty ----");
        MyQueue q = new MyQueue(3);
        System.out.println("Is empty: " + q.isEmpty()); // true

        System.out.println("\n---- Test Case 2: Add elements ----");
        q.add(10);
        q.add(20);
        q.add(30);
        q.printQueue(); // [10, 20, 30]

        System.out.println("\n---- Test Case 3: Add when full ----");
        q.add(40); // should not be added

        System.out.println("\n---- Test Case 4: Peek element ----");
        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("\n---- Test Case 5: Remove elements ----");
        System.out.println("Removed: " + q.remove()); // 10
        q.printQueue(); // [20, 30, 30]

        System.out.println("\n---- Test Case 6: Peek after remove ----");
        System.out.println("Peek: " + q.peek()); // 20

        System.out.println("\n---- Test Case 7: Remove remaining elements ----");
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        q.printQueue(); // values shifted, rear = -1

        System.out.println("\n---- Test Case 8: Remove when empty ----");
        System.out.println("Removed: " + q.remove()); // -1

        System.out.println("\n---- Test Case 9: Add after empty ----");
        q.add(50);
        q.add(60);
        q.printQueue(); // [50, 60, ?]

        System.out.println("\n---- Test Case 10: Single element queue ----");
        MyQueue single = new MyQueue(1);
        single.add(99);
        single.printQueue(); // [99]
        System.out.println("Peek: " + single.peek()); // 99
        System.out.println("Removed: " + single.remove()); // 99
        System.out.println("Removed again: " + single.remove()); // -1
    }

    public static void testLLQueue(){
        MyLLQueue q = new MyLLQueue();

        System.out.println("---- Test Case 1: Empty queue ----");
        System.out.println("Is empty: " + q.isEmpty()); // true

        System.out.println("\n---- Test Case 2: Remove from empty ----");
        System.out.println("Removed: " + q.remove()); // -1

        System.out.println("\n---- Test Case 3: Peek from empty ----");
        System.out.println("Peek: " + q.peek()); // should handle empty safely

        System.out.println("\n---- Test Case 4: Add first element ----");
        q.add(10);
        q.printQueue(); // 10

        System.out.println("\n---- Test Case 5: Add multiple elements ----");
        q.add(20);
        q.add(30);
        q.add(40);
        q.printQueue(); // 10 20 30 40

        System.out.println("\n---- Test Case 6: Peek after adds ----");
        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("\n---- Test Case 7: Remove single element ----");
        System.out.println("Removed: " + q.remove()); // 10
        q.printQueue(); // 20 30 40

        System.out.println("\n---- Test Case 8: Remove all elements ----");
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        System.out.println("Removed: " + q.remove()); // 40
        q.printQueue(); // empty

        System.out.println("\n---- Test Case 9: Remove when empty again ----");
        System.out.println("Removed: " + q.remove()); // -1

        System.out.println("\n---- Test Case 10: Add after empty ----");
        q.add(50);
        q.add(60);
        q.printQueue(); // 50 60

        System.out.println("\n---- Test Case 11: FIFO verification ----");
        System.out.println("Removed: " + q.remove()); // 50
        System.out.println("Removed: " + q.remove()); // 60

        System.out.println("\n---- Test Case 12: Final empty check ----");
        System.out.println("Is empty: " + q.isEmpty()); // true
    }

    public static void testStackQueue(){
        MyStackQueue q = new MyStackQueue();

        System.out.println("---- Test Case 1: Empty queue ----");
        System.out.println("Is empty: " + q.isEmpty()); // true

        System.out.println("\n---- Test Case 2: Remove from empty ----");
        System.out.println("Removed: " + q.remove()); // -1

        System.out.println("\n---- Test Case 3: Peek from empty ----");
        System.out.println("Peek: " + q.peek()); // -1

        System.out.println("\n---- Test Case 4: Add first element ----");
        q.add(10);
        q.printQueue(); // [10]

        System.out.println("\n---- Test Case 5: Add multiple elements ----");
        q.add(20);
        q.add(30);
        q.add(40);
        q.printQueue(); // FIFO order expected

        System.out.println("\n---- Test Case 6: Peek after adds ----");
        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("\n---- Test Case 7: Remove single element ----");
        System.out.println("Removed: " + q.remove()); // 10
        q.printQueue();

        System.out.println("\n---- Test Case 8: Remove remaining elements ----");
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        System.out.println("Removed: " + q.remove()); // 40
        q.printQueue(); // empty

        System.out.println("\n---- Test Case 9: Remove when empty again ----");
        System.out.println("Removed: " + q.remove()); // -1

        System.out.println("\n---- Test Case 10: Add after empty ----");
        q.add(50);
        q.add(60);
        q.printQueue();

        System.out.println("\n---- Test Case 11: FIFO verification ----");
        System.out.println("Removed: " + q.remove()); // 50
        System.out.println("Removed: " + q.remove()); // 60

        System.out.println("\n---- Test Case 12: Final empty check ----");
        System.out.println("Is empty: " + q.isEmpty()); // true
    }

    public static void main(String[] args) {
//        testArrayQueue();
//        testCircularQueue();
//        testLLQueue();
//        testStackQueue();
//        testQueue();
    }
}
