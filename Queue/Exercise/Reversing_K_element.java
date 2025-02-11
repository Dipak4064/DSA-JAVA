//question 4
package Queue.Exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversing_K_element {

    // This is the Iterative approach to reverse the first k element of the queue
    static void kThElementreverse(Queue<Integer> q, int k) {
        if (q.isEmpty() == true || k > q.size()) {
            return;
        }
        if (k <= 0) {
            return;
        }
        Stack<Integer> s = new Stack<>();
        // Revome the element from queue and push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        // removing the element from the stack and adding it to the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        // removing the remaining element from the queue and adding it to the same queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
        System.out.println(q);
    }

    // This is the Recursive approach to reverse the first k element of the queue
    static void kThElementreverseRecursive(Queue<Integer> q, int k) {
        if (q.isEmpty() == true || k > q.size() || k <= 0) {
            return;
        }
        helper(q, k);
        int sz = q.size() - k;
        while (sz-- > 0) {
            q.add(q.poll());
        }
        System.out.println(q);
    }

    static void helper(Queue<Integer> q, int k) {
        if (k == 0)
            return;
        int e = q.poll();
        helper(q, k - 1);
        q.add(e);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        int k = 5;
        // kThElementreverse(q, k);
        kThElementreverseRecursive(q, k);
    }
}
