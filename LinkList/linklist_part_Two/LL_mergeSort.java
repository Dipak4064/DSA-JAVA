package LinkList.linklist_part_Two;

<<<<<<< HEAD
class LL_mergeSort {
=======
import java.util.LinkedList;

public class LL_mergeSort {
>>>>>>> 4fd615e32ba12d905646fcd562e5c0386375aa85
    static class Node {
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

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // mergesort
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find the mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    // getMid
    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // Change here
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge
    public static Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        LL_mergeSort list = new LL_mergeSort();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(50);
        list.print(list.head);
        list.head = list.mergeSort(list.head);
        list.print(list.head);

=======
        LL_mergeSort ll = new LL_mergeSort();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(50);
        ll.addLast(40);
        ll.addFirst(30);
        ll.head = ll.mergeSort(ll.head);
    
>>>>>>> 4fd615e32ba12d905646fcd562e5c0386375aa85
    }
}