package Queue;

public class Queue_usingDeque {
    static class Queue {
        java.util.Deque<Integer> deque = new java.util.LinkedList<>();

        public void enqueue(int data){//addLast
            deque.addLast(data);
        }
        public int dequeue(){//removeFirst
            return deque.removeFirst();
        }
        public int peek(){//getFirst
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("peek = " + q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
