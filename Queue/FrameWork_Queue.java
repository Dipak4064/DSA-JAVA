package Queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class FrameWork_Queue {
    public static void main(String[] args) {//Tc: O(1) for add, remove, peek, poll, isEmpty, size
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.print(q.poll() + " -> ");
            // System.out.print(q.peek() + " -> ");
            // q.remove();
        }
        System.out.println("null");
    }
}
