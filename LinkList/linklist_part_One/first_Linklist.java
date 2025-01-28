package LinkList.linklist_part_One;

public class first_Linklist {
    public class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // performing addFirst operation
    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        // step 2; check if the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 3:newNode next should point to head
        tail.next = newNode;
        // step 4: update the head
        tail = newNode;
    }

    // performing addLast operation
    public void addLast(int data) {
        Node newNode = new Node(data);
        // step 1: create a new node
        // step 2: check if the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 3: tail next should point to newNode
        tail.next = newNode;
        // step 4: update the tail
        tail = newNode;
    }

    // performing print operation
    public void print() {
        if(head == null){
            System.out.println("linklist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        first_Linklist ll = new first_Linklist();
        ll.print();
        ll.addFirst(2);
        ll.print();

        ll.addFirst(3);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addLast(5);
        ll.print();

    }
}
