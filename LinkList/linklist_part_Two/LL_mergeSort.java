package LinkList.linklist_part_Two;

import java.util.LinkedList;

public class LL_mergeSort {
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

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }



    public Node getMid(Node head) {
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            // temp = temp.next;
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

    public Node mergeSort(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        // find the mid
        Node mid = getMid(head);
        // Perfom the left and right mergeSort
        Node RightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(RightHead);
        // Merge by using the temp
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LL_mergeSort ll = new LL_mergeSort();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(50);
        ll.addLast(40);
        ll.addFirst(30);
        ll.head = ll.mergeSort(ll.head);
    
    }
}
