package LinkList.Exercise;

import java.lang.classfile.components.ClassPrinter.ListNode;

class IntersectionOfTwoLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode findingStartingPointOfCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode temp = headA;
        while (temp.next != null) {
            temp = temp.next;
        }
        // temp is at tail
        temp.next = headB;
        ListNode ans = findingStartingPointOfCycle(headA);
        // Fixing the LL again
        temp.next = null;
        return ans;
    }

    public static void main(String[] args) {
                       
        
    }
}