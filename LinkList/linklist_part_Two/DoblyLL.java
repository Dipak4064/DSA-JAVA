package LinkList.linklist_part_Two;

public class DoblyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // add
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // remove
    public static int removeFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            // this look like a else if contion head == tail
            // if(size==0){
            // head = tail = null;
            // }
            int val = head.data;
            head = tail = null;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            // Node temp = head;
            // temp.next = null;
            // head.prev = null;
            return val;
        }
    }

    public static int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        } else {
            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }
    }

    // print
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoblyLL ll = new DoblyLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.print();
        System.out.println();
        System.out.println(ll.size);
        removeFirst();
        ll.print();
        System.out.println();
        System.out.println(ll.size);
        removeLast();
        ll.print();
        System.out.println();
        System.out.println(ll.size);
    }
}
