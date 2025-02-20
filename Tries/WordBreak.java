package Tries;

public class WordBreak {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr != null && curr.eow;
    }

    public static boolean wordBreaking(String key) {//tc -> O(n);
        int n = key.length();
        if (n == 0) {
            return true;
        }
        for (int i = 1; i <= n; i++) {
            if (search(key.substring(0, i)) && wordBreaking(key.substring(i, n))) {
                return true;
            }
        }
        return false;
    }   

    public static void main(String[] args) {
        String arr[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream"
        };
        for (String s : arr) {
            insert(s);
        }
        System.out.println(search("ilikesamsung"));
        String key = "ilikesamsung";
        System.out.println(wordBreaking(key));
    }
}
