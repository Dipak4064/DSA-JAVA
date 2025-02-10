package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);//1
        deque.addFirst(2);//21
        deque.addLast(3);//213
        deque.addLast(4);//2134
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        // System.out.println(deque.peekFirst());
        // System.out.println(deque.peekLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
