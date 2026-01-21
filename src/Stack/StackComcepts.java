package Stack;

import java.util.Stack;

public class StackComcepts {
    public static void main(String[] args) {
//        MyStack s = new MyStack(); // Custom Class
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        s.printStack();  // custom class function
        System.out.println(s);
        System.out.println("POP: "+ s.pop());
        System.out.println("PEEK: "+ s.peek());
    }
}
