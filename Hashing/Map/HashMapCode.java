package Map;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

class HashMapCode {
    static class HashMap<k, V> {// generic class
        private class Node {
            k key;
            V value;

            public Node(k key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N = 4;
        private LinkedList<Node>[] buckets;// N = bucckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            this.N = 2 * N;
            this.buckets = (LinkedList<Node>[]) new LinkedList[N]; // Type-safe cast
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuckets.length; i++) {
                for (Node node : oldBuckets[i]) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, V value) {// O(lambda)->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);// valid idx
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                this.n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key) {// O(lambda)->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);// valid idx
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(k key) {// O(lambda)->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);// valid idx
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                this.n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(k key) {// O(lambda)->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);// valid idx
            if (di != -1) {
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        public ArrayList<k> keySet() {// O(n)
            ArrayList<k> keys = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (Node node : buckets[i]) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return this.n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("Pak", 30);
        hm.put("US", 20);
        hm.put("UK", 10);
        // print the hm object
        for (int i = 0; i < hm.buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            for (HashMapCode.HashMap.Node node : hm.buckets[i]) {
                System.out.print("{" + node.key + "=" + node.value + "} ");
            }
            System.out.println();
        }

        System.out.println("KEY");
        ArrayList<String> keys = hm.keySet();
        for(String key:keys){
            System.out.println(key+" -> "+hm.get(key));
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("US"));

    }
}