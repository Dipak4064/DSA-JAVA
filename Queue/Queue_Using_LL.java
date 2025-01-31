package Queue;

public class Queue_Using_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty() {
            return head == null & tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) { // head == taill == null
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {// tc o(1)
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }

}
