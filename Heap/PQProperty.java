package Heap;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PQProperty {
    static class student implements Comparable<student> {
        String name;
        int rank;
        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        //One
        PriorityQueue<Integer> pq = new PriorityQueue<> (Comparator.reverseOrder());
        pq.add(3);//add has time complexity of O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());//peek has time complexity of O(1)
            pq.poll();//poll has time complexity of O(logn)
        }
        //Two
        PriorityQueue<student> pq1 = new PriorityQueue<> ();
        pq1.add(new student("A", 3));
        pq1.add(new student("B", 4));
        pq1.add(new student("C", 1));
        pq1.add(new student("D", 7));
        while (!pq1.isEmpty()) {
            student s = pq1.poll();
            System.out.println(s.name + " " + s.rank);
        }
        //what is Heap
        //Heap is a complete binary tree which satisfies the heap property
        //Heap property: In a max heap, the key at the root must be greater than or equal to the keys at its children
        //In a min heap, the key at the root must be less than or equal to the keys at its children
        //Heap is implemented using array
        //Parent of a node at index i is at index (i-1)/2
        //Left child of a node at index i is at index 2*i+1
        //Right child of a node at index i is at index 2*i+2
        //Insertion in heap: Insert the element at the end of the array and then heapify the array
        //Deletion in heap: Replace the root with the last element of the array and then heapify the array
        //Time complexity of heapify is O(logn)
        //Time complexity of building a heap is O(n)
        //Time complexity of heap sort is O(nlogn)
        
    }
}
