package LinkList.linklist_part_Two;

public class DLL_Reverse {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null; // Initialize prev to null
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

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        // head = prev;
        // Update head and tail
        if (prev != null) {
            tail = head;
            DLL_Reverse.head = prev;
        }
    }

    public static void main(String[] args) {
        DLL_Reverse dll = new DLL_Reverse();
        dll.addLast(30);
        dll.addLast(20);
        dll.addLast(10);
        dll.print();
        System.out.println();
        dll.reverse(head);
        dll.print();
    }
}
