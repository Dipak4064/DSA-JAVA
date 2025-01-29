package LinkList.linklist_part_One;

public class removNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {

            newNode.next = head;
            head = newNode;
        }
    }

    public static void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void removeNthnodeFromNodes(int idx) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if(idx == size){
            head = head.next;
            return;
        }
        int i = 1;
        Node Prev = head;
        int sz = size - idx;
        while(i < sz){
            Prev = Prev.next;
            i++;
        }
        Prev.next = Prev.next.next;
    }

    
    //-----------------------------------------------------------------------
    //finding the linkedlist is pallindrome or not
    // using the slowFast concept to find the mid of the linkedlist
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // slow pointer move 1 step
            fast = fast.next.next;// fast pointer move 2 step
        }
        return slow;
    }


    public static boolean checkPallindrome() {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }
        // step1: find the mid of the linkedlist
        Node mid = findMid(head);
        // step2: reverse the second half of the linkedlist
        Node Prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next; 
            curr.next = Prev;
            Prev = curr;
            curr = next;
        }
        Node Right = Prev;// Right is the head of the second half of the linkedlist
        Node Left = head;// Left is the head of the first half of the linkedlist
        // step3: compare the first half and second half of the linkedlist
        while (Right != null) {
            if (Left.data != Right.data) {
                return false;
            }
            Left = Left.next;
            Right = Right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        removNthNodeFromEnd ll = new removNthNodeFromEnd();
        ll.addFirst(1);
        // ll.addFirst(1);
        ll.addFirst(2);
        // ll.addFirst(1);
        ll.addFirst(1);
        ll.print();


        System.out.println();
        ll.removeNthnodeFromNodes(2);
        ll.print();


        System.out.println();
        System.out.println(checkPallindrome());

    }
}
