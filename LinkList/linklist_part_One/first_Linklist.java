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
    public static int size;

    // performing addFirst operation
    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        size++;
        // step 2; check if the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 3:newNode next should point to head
        head.next = newNode;
        // step 4: update the head
        head = newNode;
    }

    // performing addLast operation
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
        if (head == null) {
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

    // performing adding operation
    public void add(int data, int idx) {
        // if there has 0 value of idx then add the element at the first
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // performing removing operation
    // Remove First
    // Remove Last
    public static int removeFirst() {
        int val = head.data;
        // if the size of the linklist is 0 then return the minimum value
        if (size == 0) {
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // if the size of the linklist is 1 then remove the element and make the head
            // and tail as null
            val = head.data;
            head = tail = null;
        }
        /*
         * // if the head is null then return the minimum value
         * if (head == null) {
         * System.out.println("linklist is empty");
         * return -1;
         * }
         */
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        int val = tail.data;
        if (size == 0) {
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous Node: i = size -2;
        Node Prev = head;
        for (int i = 0; i < size - 2; i++) {
            Prev = Prev.next;
        }
        // int val = Prev.next.data;
        Prev.next = null;
        tail = Prev;
        size--;
        return val;
    }

    public int Search(int key) {
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

        // adding the element 9 at index 2
        ll.add(9, 2);
        ll.print();
        System.out.println("the size of LinkedList is:--> " + ll.size);

        // removing the first element
        int removeEle = ll.removeFirst();
        ll.print();
        System.out.println("the remove element is:" + removeEle);
        System.out.println("size of the LinkedList:-->" + ll.size);

        // removing the last element
        System.out.println("------------------------------");
        int removeLastEle = ll.removeLast();
        ll.print();
        System.out.println("the remove element is:" + removeLastEle);
        System.out.println("size of the LinkedList:-->" + ll.size);

        // Searching in the LinkedList
        System.out.println("------------------------------");
        System.out.println("Searching in the LinkedList index:-->" + ll.Search(4));
    }
}
