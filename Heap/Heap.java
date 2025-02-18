package Heap;

import java.util.ArrayList;

public class Heap {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add the element at the end of the array
            arr.add(data);
            // heapify the array
            int childidx = arr.size() - 1;
            int parentidx = (childidx - 1) / 2;
            while (arr.get(childidx) < arr.get(parentidx)) {// tc of heapify is O(logn)
                // min heap
                // swap
                int temp = arr.get(childidx);
                arr.set(childidx, arr.get(parentidx));
                arr.set(parentidx, temp);
                childidx = parentidx;
                parentidx = (childidx - 1) / 2;
            }
        }
        public int peek(){
            return arr.get(0);
        }


        /* delete nodes in Heap */
        public int remove(){
            int data = arr.get(0);
            //step 1 - swap the root with the last element of the array
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            //step 2 - remove the last element of the array
            arr.remove(arr.size()-1);
            //step 3 - heapify the array
            heapify(0);
            return data; 
        }
        private void heapify(int i){//tc of heapify is O(logn)
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx = left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx = right;
            }
            if(minIdx!=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }


        /*is Empty */
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(7);
        while (!h.isEmpty()) {//heap sort tc is O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
