package Queue;

import java.util.Stack;

public class Queue_by_TwoStack {
    class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add:
        // O(n), remove: O(1), peek: O(1)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove: O(1)
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek : O(1)
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue_by_TwoStack outer = new Queue_by_TwoStack();
        Queue q = outer.new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while (!q.isEmpty()) {
            System.out.println(q.peek() + " -> ");
            q.remove();
        }
    }
}
