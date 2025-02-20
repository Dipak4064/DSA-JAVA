package Tries;

public class CountUniqueSubString {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow;

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

    // public static int countUniqueSubString(String s) {
    // int count = 0;
    // for (int i = 0; i < s.length(); i++) {
    // Node curr = root;
    // for (int j = i; j < s.length(); j++) {
    // int index = s.charAt(j) - 'a';
    // if (curr.children[index] == null) {
    // insert(s.substring(i, j + 1));
    // count++;
    // }
    // curr = curr.children[index];
    // }
    // }
    // return count;
    // }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null)
                count += countNodes(root.children[i]);
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String s = "ababa";

        // suffix -> inset in trie
        for (int i = 0; i < s.length(); i++) {
            String suffix = s.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
