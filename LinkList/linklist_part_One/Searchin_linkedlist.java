package LinkList.linklist_part_One;

public class Searchin_linkedlist {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("linklist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.err.print("null");
    }

    public static int search(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Recursive search in linkedlist
    public static int searchRecursive(int key) {
        return Helper(head, key);
    }

    public static int Helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int res = Helper(head.next, key);
        if (res == -1) {
            return -1;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        Searchin_linkedlist linkL = new Searchin_linkedlist();
        linkL.addFirst(10);
        linkL.addFirst(20);
        linkL.addFirst(30);
        linkL.print();
        System.out.println();
        int key = 20;
        System.out.println("the key " + key + " Located at Index:--> " + search(key));

        System.out.println("Recursive The key " + key + " Located at Index:--> " + searchRecursive(key));

    }
}
